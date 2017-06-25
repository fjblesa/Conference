package conference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import conference.actions.create.session.ActionCreateSession;
import conference.actions.create.session.CreateSessionImpl;
import conference.entity.event.Event;
import conference.entity.event.LunchEvent;
import conference.entity.session.MorningSession;
import conference.test.utils.TestUtils;

public class CreateMorningSessionTest {

	private ActionCreateSession createSession = new CreateSessionImpl();

	static List<Event> listEventMoveLunch;
	
	static List<Event> listDataEvent;

	@BeforeClass
	public static void setUp() throws Exception{
	
			listDataEvent = TestUtils.create180MinEvents();
			listEventMoveLunch = TestUtils.createListEventsMoveLunch();
	
	}
	
	@Test
	public void createMorningSessionTest() throws Exception{
		MorningSession morningSession = (MorningSession) createSession.create(listDataEvent,new MorningSession());
		assertFalse(morningSession.getListEvents().isEmpty());
		assertTrue(morningSession.getTotalDuration() == 0);
		final Event lunch = morningSession.getLunchEvent();
		assertEquals("12:00PM", lunch.getHourOfEvent());
	}
	
	@Test
	public void deberiaMoverElAlmuerzoALasDoceTreinta(){
		MorningSession morningSession = (MorningSession) createSession.create(listEventMoveLunch , new MorningSession());
		final Event lunch = morningSession.getLunchEvent();
		assertEquals("12:30PM", lunch.getHourOfEvent());
	}
}
