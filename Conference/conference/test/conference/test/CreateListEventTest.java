package conference.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import conference.actions.create.event.ActionCreateEvent;
import conference.actions.create.event.CreateTypeEventImpl;
import conference.entity.event.Event;
import conference.test.utils.TestUtils;

public class CreateListEventTest {

	private static List<String> inputList;
	private static ActionCreateEvent createListEvent = new CreateTypeEventImpl();

	@BeforeClass
	public static void setUp() {
		inputList = TestUtils.createListTwoData();
	}

	@Test
	public void createEventList() throws Exception {
		List<Event> inputListEvents = createListEvent.create(inputList);
		for (Event event : inputListEvents) {
			assertFalse(event.getName().isEmpty());
			assertNotNull(event.getDuration());
		}
	}
}
