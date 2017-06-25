package conference.actions.print;

import java.util.List;

import conference.entity.Conference;
import conference.entity.Thematic;
import conference.entity.event.Event;
import conference.entity.session.Session;

/**
 * Implements to ActionPrintConference
 * 
 * @author fblesa
 *
 */
public class PrintConference implements ActionPrintConference {

	/* (non-Javadoc)
	 * @see conference.actions.conference.print.ActionPrintConference#print(conference.entity.Conference)
	 */
	@Override
	public String print(Conference conference) {
		String printConference = "CONFERENCIA \n";
		List<Thematic> listThematics = conference.getListThematics();
		int cont = 1;
		for (Thematic thematic : listThematics) {
			printConference += "Temática " + cont++ + ":\n";
			printConference += printSessionOfThematic(thematic.getMorningSession());
			printConference += printSessionOfThematic(thematic.getAfternoonSession());
		}
		return printConference;
	}
	
	/**
	 * This method is to print thematic sessions
	 * @param session
	 * @return
	 */
	private String printSessionOfThematic(Session session){
		String eventToString = "";
		for (Event event : session.getListEvents()) {
			eventToString += event.getHourOfEvent() + " " + event.getName();
			if(event.getDuration() != 0)
				eventToString += " " + event.getDuration() + "min";
			eventToString += "\n";
		}
		return eventToString;
	}
}
