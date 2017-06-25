package conference.actions.create.session;

import java.util.List;

import conference.entity.event.Event;
import conference.entity.session.Session;

/**
 * Interface to create session
 * 
 * @author fblesa
 *
 */
public interface ActionCreateSession {

	/**
	 * Method to create a session, depending on the type of session that is
	 * created receive this.
	 * 
	 * @param listEvent
	 * @param session
	 * @return	
	 */
	public Session create(List<Event> listEvent, Session session);
}
