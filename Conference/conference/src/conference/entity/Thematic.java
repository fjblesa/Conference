package conference.entity;

import conference.entity.session.AfternoonSession;
import conference.entity.session.MorningSession;

public class Thematic {

	private MorningSession morningSession;
	
	private AfternoonSession afternoonSession;

	public AfternoonSession getAfternoonSession() {
		return afternoonSession;
	}

	public void setAfternoonSession(AfternoonSession afternoonSession) {
		this.afternoonSession = afternoonSession;
	}

	public MorningSession getMorningSession() {
		return morningSession;
	}

	public void setMorningSession(MorningSession morningSession) {
		this.morningSession = morningSession;
	}
}
