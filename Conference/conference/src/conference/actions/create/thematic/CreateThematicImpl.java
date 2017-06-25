package conference.actions.create.thematic;

import java.util.List;

import conference.actions.create.session.ActionCreateSession;
import conference.actions.create.session.CreateSessionImpl;
import conference.entity.Thematic;
import conference.entity.event.Event;
import conference.entity.session.AfternoonSession;
import conference.entity.session.MorningSession;

/**
 * Implements to create a thematic
 * 
 * @author fblesa
 *
 */
public class CreateThematicImpl implements ActionCreateThematic {

	private Thematic thematic;
	private ActionCreateSession createSession = new CreateSessionImpl();
	
	/* (non-Javadoc)
	 * @see conference.actions.thematic.ActionCreateThematic#create(java.util.ArrayList)
	 */
	@Override
	public Thematic create(List<Event> listEvent)   {
		thematic = new Thematic();
		thematic.setMorningSession((MorningSession) createSession.create(listEvent, new MorningSession()));
		thematic.setAfternoonSession((AfternoonSession) createSession.create(listEvent,new AfternoonSession()));
		
		return thematic;
	}

}
