package conference.utils.session;

import conference.entity.event.Event;
import conference.entity.event.LunchEvent;
import conference.entity.event.NetworkingEvent;
import conference.entity.session.AfternoonSession;
import conference.entity.session.MorningSession;
import conference.entity.session.Session;
import conference.exceptions.SessionFormatException;

/**
 * Utilities to find type of Event, lunch or networking
 * 
 * @author fblesa
 *
 */
public class OtherTypeEventUtils {
	
	private final static String LUNCH ="lunch";
	private final static String NETWORKINGEVENT = "networking";
	private final static String FIVEPM = "5:00PM";
	private final static String FOURPM = "4:00PM";

	/**
	 * Depending on the type of session, an event is created or another.
	 * 
	 * @param session
	 * @return
	 * @throws SessionFormatException
	 */
	public static Event addLunchOrNetworkingEventToSession(Session session)  {
		
		switch (findTypeOfEvent(session)) {
		case LUNCH:
			return new LunchEvent();			
			
		case NETWORKINGEVENT:
			if(session.getTotalDuration()>60)
				return new NetworkingEvent(FOURPM);
			return new NetworkingEvent(FIVEPM);
			
		default:
			throw new SessionFormatException();
		}
	}
	
	/**
	 * Find the type of event. MorningSession = LUNCH, AfternoonSession = NETWORKINGEVENT
	 * 
	 * @param session
	 * @return
	 */
	public static String findTypeOfEvent(Session session)
	{
		String typeOfOthersEvent = "";
		
		if(session instanceof MorningSession){
			typeOfOthersEvent = LUNCH;
		}
		
		if(session instanceof AfternoonSession)
			typeOfOthersEvent = NETWORKINGEVENT;
		return typeOfOthersEvent;
	}
}
