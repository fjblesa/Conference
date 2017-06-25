package conference.actions.create.event;

import java.util.List;

import conference.entity.event.Event;

/**
 * Interface to create Event
 * 
 * @author fblesa
 *
 */
public interface ActionCreateEvent{
	/**
	 * 
	 * Method to create Event, receives only one input
	 * 
	 * @param eventInput
	 * @return
	 */
	public Event create(String eventInput)  ;

	/**
	 * This method is to create a Events, receives a list input
	 * 
	 * @param listEventInput
	 * @return
	 */
	public List<Event> create(List<String> listEventInput)  ;
}
