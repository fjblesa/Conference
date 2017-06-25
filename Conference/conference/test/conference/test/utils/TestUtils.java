package conference.test.utils;

import java.util.ArrayList;
import java.util.List;

import conference.actions.create.event.ActionCreateEvent;
import conference.actions.create.event.CreateTypeEventImpl;
import conference.entity.event.Event;

/**
 * Utilities to create different list of data
 * 
 * @author fblesa
 *
 */
public class TestUtils {

	private static List<String> inputList;
	private static List<String> inputNormalList;
	private static List<String> inputLightningList;
	
	public static List<String> createOneListData(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputList.add("Overdoing it in Python 45min");
		inputList.add("Lua for the Masses 30min");
		inputList.add("Ruby Errors from Mismatched Gem Versions 45min");
		inputList.add("Common Ruby Errors 45min");
		inputList.add("Rails for Python Developers lightning");
		inputList.add("Communicating Over Distance 60min");
		return inputList;
	}
	
	public static List<String> createListTwoData(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputList.add("Overdoing it in Python 45min");
		inputList.add("Lua for the Masses 30min");
		inputList.add("Ruby Errors from Mismatched Gem Versions 45min");
		inputList.add("Common Ruby Errors 45min");
		inputList.add("Rails for Python Developers lightning");
		inputList.add("Communicating Over Distance 60min");
		inputList.add("Accounting-Driven Development 45min");
		inputList.add("Woah 30min");
		inputList.add("Sit Down and Write 30min");
		inputList.add("Pair Programming vs Noise 45min");
		inputList.add("Rails Magic 60min");
		inputList.add("Ruby on Rails: Why We Should Move On 60min");
		inputList.add("Clojure Ate Scala (on my project) 45min");
		inputList.add("Programming in the Boondocks of Seattle 30min");
		inputList.add("Ruby vs. Clojure for Back-End Development 30min");
		inputList.add("Ruby on Rails Legacy App Maintenance 60min");
		inputList.add("A World Without HackerNews 30min");
		inputList.add("User Interface CSS in Rails Apps 30min");
		return inputList;
	}
	
	public static List<String> createListThreeData(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputList.add("Overdoing it in Python 45min");
		inputList.add("Lua for the Masses 30min");
		inputList.add("Ruby Errors from Mismatched Gem Versions 45min");
		inputList.add("Common Ruby Errors 45min");
		inputList.add("Rails for Python Developers lightning");
		inputList.add("Communicating Over Distance 60min");
		inputList.add("Accounting-Driven Development 45min");
		inputList.add("Woah 30min");
		inputList.add("Sit Down and Write 30min");
		inputList.add("Pair Programming vs Noise 45min");
		inputList.add("Rails Magic 60min");
		inputList.add("Ruby on Rails: Why We Should Move On 60min");
		inputList.add("Clojure Ate Scala (on my project) 45min");
		inputList.add("Programming in the Boondocks of Seattle 30min");
		inputList.add("Ruby vs. Clojure for Back-End Development 30min");
		inputList.add("Ruby on Rails Legacy App Maintenance 60min");
		inputList.add("A World Without HackerNews 30min");
		inputList.add("User Interface CSS in Rails Apps 30min");
		inputList.add("Ruby vs. Clojure for Back-End Development 30min");
		inputList.add("User Interface CSS in Rails Apps 30min");
		return inputList;
	}
	
	public static List<String> createListErrorData(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails");
		return inputList;
	}
	
	public static List<String> createLightningListEventData(){
		inputLightningList = new ArrayList<>();
		inputLightningList.add("Rails for Python Developers lightning");
		inputLightningList.add("Communicating Over Distance lightning");
		return inputLightningList;
	}
	
	public static List<String> createNormaListEventData(){
		inputNormalList = new ArrayList<>();
		inputNormalList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputNormalList.add("Overdoing it in Python 45min");
		return inputNormalList;
	}
	
	public static List<Event> createListEvents() throws Exception{
		createListTwoData();
		ActionCreateEvent createEvents = new CreateTypeEventImpl();
		return createEvents.create(inputList);
	}
	
	public static List<String> createOneListDataMoveLunch(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputList.add("Overdoing it in Python 45min");
		inputList.add("Lua for the Masses 30min");
		inputList.add("Ruby Errors from Mismatched Gem Versions 75min");
		return inputList;
	}

	public static List<Event> createListEventsMoveLunch() {
		createOneListDataMoveLunch();
		ActionCreateEvent createEvent = new CreateTypeEventImpl();
		return createEvent.create(inputList);
	}
	
	public static List<String> create180MinList(){
		inputList = new ArrayList<>();
		inputList.add("Writing Fast Tests Against Enterprise Rails 60min");
		inputList.add("Overdoing it in Python 45min");
		inputList.add("Lua for the Masses 30min");
		inputList.add("Ruby Errors from Mismatched Gem Versions 45min");
		return inputList;
	}

	public static List<Event> create180MinEvents() {
		create180MinList();
		ActionCreateEvent createEvent = new CreateTypeEventImpl();
		return createEvent.create(inputList);
	}
}
