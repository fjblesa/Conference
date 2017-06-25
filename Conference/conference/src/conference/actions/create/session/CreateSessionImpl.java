package conference.actions.create.session;

import java.util.ArrayList;
import java.util.List;

import conference.entity.event.Event;
import conference.entity.session.Session;
import conference.utils.session.OtherTypeEventUtils;

/**
 * Implements to create a session
 * 
 * @author fblesa
 *
 */
public class CreateSessionImpl implements ActionCreateSession {

	/* (non-Javadoc)
	 * @see conference.actions.session.ActionCreateSession#create(java.util.ArrayList, conference.entity.session.Session)
	 */
	@Override
	public Session create(List<Event> listEvent, Session session)  {
		
		List<Event> eventsInSession = new ArrayList<>();
		boolean moveLunch = false;
		
		for (Event event : listEvent) {
			if(session.getTotalDuration()>=event.getDuration()){
				session.setEvent(event);
				eventsInSession.add(event);
			} else if (session.getTotalDuration()+30 >= event.getDuration()) {
				moveLunch = true;
			}
		}
		listEvent.removeAll(eventsInSession);
		session.setEvent(OtherTypeEventUtils.addLunchOrNetworkingEventToSession(session));
		if(moveLunch) {
			List<Event> listOfEvents = session.getListEvents();
			Event lunchEvent = listOfEvents.get(listOfEvents.size()-1);
			lunchEvent.setHourOfEvent("12:30PM");
		}
		return session;
	}
}
