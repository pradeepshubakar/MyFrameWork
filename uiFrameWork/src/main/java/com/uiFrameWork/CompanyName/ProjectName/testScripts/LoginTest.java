package com.uiFrameWork.CompanyName.ProjectName.testScripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.uiFrameWork.CompanyName.ProjectName.PageObjects.HomePage;
import com.uiFrameWork.CompanyName.ProjectName.PageObjects.LoginPage;
import com.uiFrameWork.CompanyName.ProjectName.helper.assertion.AssertHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.wait.WaitHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class LoginTest extends TestBase {

	private Logger log = LoggerHelper.getLogger(LoginTest.class);
	@Test(description = "login test with valid credentials")
	public void testLogin() throws InterruptedException {
		getApplicationUrl(ObjectReader.reader.getUrl());
		LoginPage l = new LoginPage(driver);

		l.clickOnLoginInLink();
		l.enterUserName(ObjectReader.reader.getUserName());
		l.enterPassword(ObjectReader.reader.getPassWord());
		l.clickOnSubmit();
		
		Thread.sleep(10000);
		
		  boolean status = l.verifySuccessLoginMsg();
		  AssertHelper.updateTestStatus(status);
		 
		  
		HomePage homePage = new HomePage(driver);
		homePage.clickOnProfileLink();
		homePage.updateResume();
		Thread.sleep(10000);
		status = homePage.verifyresumeupdated();
		AssertHelper.updateTestStatus(status);
		homePage.clickOnLogOut();
	}
}
