package conference.actions.create.event;

import java.util.ArrayList;
import java.util.List;

import conference.entity.event.Event;
import conference.utils.StringUtils;

/**
 * Implements to Create a normal Event
 * 
 * @author fblesa
 *
 */
public class CreateNormalEventImpl implements ActionCreateEvent{

	private final String MIN = "min";
	private final int ZERO = 0;
	
	/* (non-Javadoc)
	 * @see conference.actions.event.ActionCreateEvent#create(java.lang.String)
	 */
	@Override
	public Event create(String eventInput) {

		Event eventNormalResult = new Event();
		
		String [] input = eventInput.split(" ");
		String name = "";
		
		
		
		for (String stringInput : input) {
			if(stringInput.contains(MIN)){
				 String[] durationString = stringInput.split(MIN);
				 if(StringUtils.isNumeric(durationString[ZERO]))
					 eventNormalResult.setDuration(Integer.parseInt(durationString[ZERO]));
			}
			else{
				name = name + " " + stringInput;
			}
		}
		eventNormalResult.setName(name.substring(1,name.length()));
		return eventNormalResult;
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
