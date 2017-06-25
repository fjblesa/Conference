package conference.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import conference.actions.create.event.ActionCreateEvent;
import conference.actions.create.event.CreateTypeEventImpl;
import conference.entity.event.Event;
import conference.exceptions.EventFormatException;
import conference.test.utils.TestUtils;

public class CreateEventTest {

	private static ActionCreateEvent createEvent = new CreateTypeEventImpl();
	
	private static List<String> inputNormalList;
	private static List<String> inputLightningList;

	@BeforeClass
	public static void setUp() {
		inputNormalList = TestUtils.createNormaListEventData();
		inputLightningList = TestUtils.createLightningListEventData();
	}

	
	@Test
	public void createNormalEvent()  {
		Event event= createEvent.create("Writing Fast Tests Against Enterprise Rails 60min");
		assertEquals(event.getDuration(), new Integer(60));
		assertEquals(event.getName(), "Writing Fast Tests Against Enterprise Rails");
	}
	
	@Test
	public void createListNormalEvents()  {
		List<Event> listNormalEvents= createEvent.create(inputNormalList);
		assertEquals(listNormalEvents.get(0).getDuration(), new Integer(60));
		assertEquals(listNormalEvents.get(0).getName(), "Writing Fast Tests Against Enterprise Rails");
		assertEquals(listNormalEvents.get(1).getDuration(), new Integer(45));
		assertEquals(listNormalEvents.get(1).getName(), "Overdoing it in Python");
	}
	
	@Test
	public void createEventLightning()  {
		Event event= createEvent.create("Rails for Python Developers lightning");
		assertEquals(event.getDuration(), new Integer(5));
		assertEquals(event.getName(), "Rails for Python Developers");
	}
	
	@Test
	public void createListEventLightning()  {
		List<Event> listEvent= createEvent.create(inputLightningList);
		assertEquals(listEvent.get(0).getDuration(), new Integer(5));
		assertEquals(listEvent.get(0).getName(), "Rails for Python Developers");
		assertEquals(listEvent.get(1).getDuration(), new Integer(5));
		assertEquals(listEvent.get(1).getName(), "Communicating Over Distance");
	}
	
	@Test(expected = EventFormatException.class)
	public void createEventException()  {
		createEvent.create("Rails for Python Developers");
	}
}
