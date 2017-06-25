package conference.entity.session;

import conference.entity.event.LunchEvent;

/**
 * Entity Session Morning
 * 
 * @author fblesa
 *
 */
public class MorningSession extends Session{

	private final static Integer TIEMPO = 180;
	private final static Integer NINEAMINMINUTES = 540; 
	private final static String AM = "AM";
	
	public MorningSession() {
		super();
		this.setAmOrPm(AM);
		this.setLastHouEvent(NINEAMINMINUTES);
		this.setTotalDuration(TIEMPO);
	}

	public LunchEvent getLunchEvent() {
		return (LunchEvent) getListEvents().get(getListEvents().size() -1);
	}
}
