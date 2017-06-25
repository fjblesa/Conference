package conference.actions.create.conference;

import java.util.ArrayList;
import java.util.List;

import conference.actions.create.event.ActionCreateEvent;
import conference.actions.create.event.CreateTypeEventImpl;
import conference.actions.create.thematic.ActionCreateThematic;
import conference.actions.create.thematic.CreateThematicImpl;
import conference.entity.Conference;
import conference.entity.Thematic;
import conference.entity.event.Event;

/**
 * Method to create a new Conference
 * 
 * @author fblesa
 *  
 */
public class CreateConferenceImpl implements ActionCreateConference {

	ActionCreateEvent createEvent = new CreateTypeEventImpl();
	ActionCreateThematic createThematic = new CreateThematicImpl();
	
	/* (non-Javadoc)
	 * @see conference.actions.conference.create.ActionCreateConference#create(java.util.ArrayList)
	 */
	@Override
	public Conference create(List<String> listInputEventsConference)   {

		Conference conference = new Conference();
		List<Thematic> listThematics = new ArrayList<>();
		
		List<Event> listEvents = createEvent.create(listInputEventsConference);

		while (listEvents.size()>0) {
			listThematics.add(createThematic.create(listEvents));
		}
		
		conference.setListThematics(listThematics);
		return conference;
	}

}
