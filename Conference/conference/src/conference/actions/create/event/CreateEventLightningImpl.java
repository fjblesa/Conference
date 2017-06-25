package conference.actions.create.event;

import java.util.ArrayList;
import java.util.List;

import conference.entity.event.Event;
import conference.entity.event.EventLightning;

/**
 * Implements to Create a Lightning Event
 * 
 * @author fblesa
 *
 */
public class CreateEventLightningImpl implements ActionCreateEvent{
	
	private final String LIGHTNING ="lightning";
	
	/* (non-Javadoc)
	 * @see conference.actions.event.ActionCreateEvent#create(java.lang.String)
	 */
	@Override
	public Event create(String eventInput) {

		Event eventResultLightning = new EventLightning();
		
		String [] input = eventInput.split(" ");
		String name = "";
		
			for (String string : input) {
				if(string.contains(LIGHTNING)){
					break;
				}
					name = name +" "+string;
			}
			eventResultLightning.setName(name.substring(1,name.length()));
		return eventResultLightning;
	}

	/* (non-Javadoc)
	 * @see conference.actions.event.ActionCreateEvent#create(java.util.ArrayList)
	 */
	@Override
	public List<Event> create(List<String> listEventInput)   {
		List<Event> listEvent = new ArrayList<>();
		for (String event : listEventInput) {
			listEvent.add(create(event));
		}
		return listEvent;
	}
}
