package conference.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import conference.actions.create.conference.ActionCreateConference;
import conference.actions.create.conference.CreateConferenceImpl;
import conference.entity.Conference;
import conference.entity.Thematic;
import conference.test.utils.TestUtils;

public class ConferenceTest {

	@Test
	public void createConferenceTest()  {
		
		List<String> listInputEventsConference = TestUtils.createListTwoData();
		
		ActionCreateConference createConference = new CreateConferenceImpl();
		
		Conference conference = createConference.create(listInputEventsConference);
		
		List<Thematic> listThematics = conference.getListThematics();
		assertFalse(listThematics.isEmpty());
		assertTrue(listThematics.size() == 2);
		for (Thematic thematic : listThematics) {
			assertTrue(thematic.getMorningSession().getListEvents().size() > 1);
			assertTrue(thematic.getAfternoonSession().getListEvents().size() > 1);
			assertTrue(thematic.getMorningSession().getTotalDuration() <= 30);
		}
	}
}
