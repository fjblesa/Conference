package conference.actions.print;

import conference.entity.Conference;

/**
 * Interface to print conference
 * 
 * @author fblesa
 *
 */
public interface ActionPrintConference {

	/**
	 * This method is to print the entire Conference
	 * @param conference
	 * @return
	 */
	public String print(Conference conference);

}
