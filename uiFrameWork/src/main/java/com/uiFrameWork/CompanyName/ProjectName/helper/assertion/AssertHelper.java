package com.uiFrameWork.CompanyName.ProjectName.helper.assertion;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class AssertHelper {

	private static Logger log = LoggerHelper.getLogger(AssertHelper.class);
	
	public static void verifyText(String s1, String s2) {
		log.info("verifying text: "+s1+" with "+s2);
		TestBase.logExtentReport("verifying text: "+s1+" with "+s2);
		Assert.assertEquals(s1, s2);
	}
	
	public static void makeTrue() {
		log.info("making script pass..");
		TestBase.logExtentReport("making script pass..");
		Assert.assertTrue(true);
	}
	
	public static void makeTrue(String message) {
		log.info("making script pass..");
		TestBase.logExtentReport("making script pass..");
		Assert.assertTrue(true, message);
	}
	
	public static void makeFalse() {
		log.info("making script fail..");
		TestBase.logExtentReport("making script fail..");
		Assert.assertTrue(false);
	}
	
	public static void makeFalse(String message) {
		log.info("making script fail..");
		TestBase.logExtentReport("making script fail..");
		Assert.assertTrue(false, message);
	}
	
	public static void verifyTrue(boolean status) {
		log.info("verifying object is pass..");
		TestBase.logExtentReport("verifying object is true..");
		Assert.assertTrue(status);
	}
	
	public static void verifyFalse(boolean status) {
		log.info("verifying object is fail..");
		TestBase.logExtentReport("verifying object is fail..");
		Assert.assertFalse(status);
	}
	
	public static void verifyNull(String s1) {
		log.info("verifying object is null..");
		TestBase.logExtentReport("verifying object is null..");
		Assert.assertNull(s1);
	}
	
	public static void verifyNotNull(String s1) {
		log.info("verifying object is not null..");
		TestBase.logExtentReport("verifying object is not null..");
		Assert.assertNotNull(s1);
	}
	public static void fail() {
		Assert.assertTrue(false);
	}
	
	public static void pass() {
		Assert.assertTrue(true);
	}
	
	public static void updateTestStatus(boolean status) {
		if(status) {
			pass();
		}
		else {
			fail();
		}
	}

}
