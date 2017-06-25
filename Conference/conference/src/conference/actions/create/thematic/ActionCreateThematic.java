package conference.actions.create.thematic;

import java.util.List;

import conference.entity.Thematic;
import conference.entity.event.Event;

/**
 * Interface to create a thematic
 * 
 * @author fblesa
 *
 */
public interface ActionCreateThematic {

	/**
	 * Method to create a thematic.
	 * 
	 * @param listEvent
	 * @return	
	 */
	public Thematic create(List<Event> listEvent)  ;
}
