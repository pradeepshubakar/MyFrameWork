package com.uiFrameWork.CompanyName.ProjectName.testScripts;

import org.testng.annotations.Test;

import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class TakeScreenShot extends TestBase {

	@Test
	public void testScreen() {
		//driver.get("https://www.speedtest.net/result/9701767094");
		getApplicationUrl("https://www.amazon.in/");
		//getNavigationScreen(driver);
	}
}
