package conference.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import conference.actions.create.session.ActionCreateSession;
import conference.actions.create.session.CreateSessionImpl;
import conference.entity.event.Event;
import conference.entity.event.NetworkingEvent;
import conference.entity.session.AfternoonSession;
import conference.test.utils.TestUtils;

public class CreateAfternoonSessionTest {

	private ActionCreateSession createSession = new CreateSessionImpl();
	
	static List<Event> listDataEvent;
	
	@BeforeClass
	public static void setUp() throws Exception{
	
			listDataEvent = TestUtils.createListEvents();
		
	}
	
	@Test
	public void createAfternoonSessionTest() throws Exception{
		AfternoonSession afternoonSession = (AfternoonSession) createSession.create(listDataEvent,new AfternoonSession());
		assertFalse(afternoonSession.getListEvents().isEmpty());
		assertTrue(afternoonSession.getTotalDuration() == 0 || afternoonSession.getTotalDuration()<=60);
		assertTrue(afternoonSession.getListEvents().get(afternoonSession.getListEvents().size()-1) instanceof NetworkingEvent);
	}
}
