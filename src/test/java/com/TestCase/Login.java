package com.TestCase;



import org.testng.annotations.Test;

import com.Keywords.All;

public class Login {

	@Test
	public void excecution()
	{
		All.openBrowser("chrome");
		All.openUrl("https://kite.zerodha.com/?next=%2Fdashboard#loggedout");
		
		All.maximize();

		All.enterText("xpath","//input[@id='userid']", "DN1656");
		//All.waiting();
		
		All.enterText("xpath","//input[@id='password']", "Bablu@123");
		//All.waiting();
		All.clkOperation("xpath", "//button[contains(text(),'Login')]");
		All.waiting();
		
		All.enterText("id", "pin", "821993");
		All.clkOperation("xpath", "//button[@type='submit']");
		
		All.waitingMore();
		All.closeAll();
	}
}
	