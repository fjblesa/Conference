package conference.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import conference.actions.create.thematic.ActionCreateThematic;
import conference.actions.create.thematic.CreateThematicImpl;
import conference.entity.Thematic;
import conference.entity.event.Event;
import conference.test.utils.TestUtils;

public class CreateThematicTest {
	
	@Test
	public void createThematicTest() throws Exception {

		List<Event> listEvents = TestUtils.createListEvents();
		
		ActionCreateThematic createThematic = new CreateThematicImpl();
		
		Thematic thematic = createThematic.create(listEvents);
		
		assertTrue(thematic.getMorningSession().getTotalDuration() == Integer.parseInt("0"));
		assertTrue(thematic.getAfternoonSession().getTotalDuration() == Integer.parseInt("25"));
		
		thematic = createThematic.create(listEvents);
	}

	@Test
	public void createAddAllEventsInThematicTest() throws Exception {
		
		List<Event> listEvents = TestUtils.createListEvents();
		
		ActionCreateThematic createThematic = new CreateThematicImpl();
		
		Thematic thematicOne = createThematic.create(listEvents);
		
		assertTrue(thematicOne.getMorningSession().getTotalDuration() == Integer.parseInt("0"));
		assertTrue(thematicOne.getAfternoonSession().getTotalDuration() == Integer.parseInt("25"));
		
		Thematic thematicTwo = createThematic.create(listEvents);
		assertTrue(thematicTwo.getMorningSession().getTotalDuration() == Integer.parseInt("15"));
		assertTrue(thematicTwo.getAfternoonSession().getTotalDuration() == Integer.parseInt("15"));
		assertTrue(listEvents.size()==0);
	}
}
