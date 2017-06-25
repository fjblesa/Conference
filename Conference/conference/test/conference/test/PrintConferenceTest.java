package conference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import conference.actions.create.conference.ActionCreateConference;
import conference.actions.create.conference.CreateConferenceImpl;
import conference.actions.print.ActionPrintConference;
import conference.actions.print.PrintConference;
import conference.entity.Conference;
import conference.exceptions.EventFormatException;
import conference.test.utils.TestUtils;

public class PrintConferenceTest {

	@Test
	public void printConfrenceOneThematic()    {
		
		ActionCreateConference createConference = new CreateConferenceImpl();
		
		Conference conference= createConference.create(TestUtils.createOneListData());
		
		ActionPrintConference printConference = new PrintConference();
		
		assertFalse(printConference.print(conference).isEmpty());
		assertEquals(conference.getListThematics().size(),1);
	}
	
	@Test
	public void printConferenceTwoThematics()   {
		
		ActionCreateConference createConference = new CreateConferenceImpl();
		
		Conference conference= createConference.create(TestUtils.createListTwoData());
		
		ActionPrintConference printConference = new PrintConference();
		
		assertFalse(printConference.print(conference).isEmpty());
		assertEquals(conference.getListThematics().size(),2);
	}
	
	
	@Test
	public void printConfrenceThreeThematic(){
		
		ActionCreateConference createConference = new CreateConferenceImpl();
		
		Conference conference= createConference.create(TestUtils.createListThreeData());
		
		ActionPrintConference printConference = new PrintConference();
		
		assertFalse(printConference.print(conference).isEmpty());
		assertEquals(conference.getListThematics().size(),3);
	}
	
	@Test(expected = EventFormatException.class)
	public void printConfrenceExceptionTest()  {
		
		ActionCreateConference createConference = new CreateConferenceImpl();
		
		createConference.create(TestUtils.createListErrorData());
	}
}
