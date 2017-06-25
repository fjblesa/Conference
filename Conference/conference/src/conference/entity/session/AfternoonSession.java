package conference.entity.session;

/**
 * Entity Session Afternoon
 * 
 * @author fblesa
 *
 */
public class AfternoonSession extends Session {
	
	private final static String PM = "PM";
	private Integer TIME = 240;
	private final static Integer ONEAMINMINUTES = 60; 
	
	public AfternoonSession() {
		super();
		this.setAmOrPm(PM);
		this.setLastHouEvent(ONEAMINMINUTES);
		this.setTotalDuration(TIME);
	}
}
