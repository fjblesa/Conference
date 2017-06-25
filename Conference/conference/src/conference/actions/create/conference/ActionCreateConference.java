package conference.actions.create.conference;

import java.util.List;

import conference.entity.Conference;

/**
 * 
 * Interface to create the conference
 * @author fblesa
 *
 */
public interface ActionCreateConference {

	/**
	 * This method creates a new Conference, only needs a list to events. If the
	 * parameters are not well coded list, returns an error
	 * 
	 * @param listInputEventsConference
	 * @return	
	 * @throws Exception
	 */
	public Conference create(List<String> listInputEventsConference);
}
