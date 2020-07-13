package com.uiFrameWork.CompanyName.ProjectName.testScripts;

import org.testng.annotations.Test;

import com.uiFrameWork.CompanyName.ProjectName.helper.alert.AlertHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.wait.WaitHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class Demo1 extends TestBase {

	@Test
	public void testLogin() {
		AlertHelper a = new AlertHelper(driver);
		WaitHelper h = new WaitHelper(driver);
		driver.get("http://www.google.com/");
	}
}
