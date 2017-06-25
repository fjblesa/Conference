package conference.actions.create.event;

import java.util.ArrayList;
import java.util.List;

import conference.entity.event.Event;
import conference.exceptions.EventFormatException;

/**
 * Implements to Create a Type of Event
 * 
 * @author fblesa
 *
 */
public class CreateTypeEventImpl implements ActionCreateEvent{

	private final String LIGHTNING = "lightning";
	private final String MIN = "min"; 
	private final String NOTEVENT = "Not Event";
	
	
	/* (non-Javadoc)
	 * @see conference.actions.event.ActionCreateEvent#create(java.lang.String)
	 */
	@Override
	public Event create(String eventInput)   {
		ActionCreateEvent createEventLightning = new CreateEventLightningImpl();
		ActionCreateEvent createNormalEvent = new CreateNormalEventImpl();
		
		switch (searchTypeEvent(eventInput)) {
		case LIGHTNING:
			return createEventLightning.create(eventInput);			
		case MIN:
			return createNormalEvent.create(eventInput);
		default:
			throw new EventFormatException(eventInput);
		}
	}

	/* (non-Javadoc)
	 * @see conference.actions.event.ActionCreateEvent#create(java.util.ArrayList)
	 */
	@Override
	public List<Event> create(List<String> listEventInput)   {
		List<Event> listEvents = new ArrayList<>();
		for (String inputEvent : listEventInput) {
			listEvents.add(create(inputEvent));
		}
		return listEvents;
	}
	
	/**
	 * Method to search the type of the event to create this
	 * 
	 * @param event
	 * @return
	 */
	private String searchTypeEvent(String event){
		
		if(event.contains(MIN))
			return MIN;
		
		if(event.contains(LIGHTNING))
			return LIGHTNING;
		
		return NOTEVENT;
	}
}
