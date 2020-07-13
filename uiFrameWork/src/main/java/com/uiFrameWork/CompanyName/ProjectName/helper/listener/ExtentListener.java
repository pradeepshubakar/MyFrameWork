package com.uiFrameWork.CompanyName.ProjectName.helper.listener;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class ExtentListener implements ITestListener {

	private Logger log = LoggerHelper.getLogger(ExtentListener.class);

	private static ExtentReports extent;
	private static ExtentTest test;

	public void onTestStart(ITestResult arg0) {
		//test.log(Status.INFO, arg0.getName()+" started..");
		
		Reporter.log(arg0.getMethod().getMethodName()+" test started..");
		log.info(arg0.getMethod().getMethodName()+" test started..");
		TestBase.logExtentReport(arg0.getMethod().getMethodName()+" test started..");
	}

	public void onTestSuccess(ITestResult arg0) {
		//test.log(Status.PASS, arg0.getName()+" passed");
		
		Reporter.log(arg0.getMethod().getMethodName()+" test passed..");
		log.info(arg0.getMethod().getMethodName()+" test passed..");
	}

	public void onTestFailure(ITestResult arg0) {
		// test.log(Status.FAIL, arg0.getThrowable());
		Reporter.log(arg0.getMethod().getMethodName() + " test failed.." + arg0.getThrowable());
		log.info(arg0.getMethod().getMethodName() + " test failed.." + arg0.getThrowable());
	}

	public void onTestSkipped(ITestResult arg0) {
		// test.log(Status.SKIP, arg0.getThrowable());
		Reporter.log(arg0.getMethod().getMethodName() + " test skipped.." + arg0.getThrowable());
		log.info(arg0.getMethod().getMethodName() + " test skipped.." + arg0.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// extent = ExtentManager.getInstance();
		// test = extent.createTest(arg0.getName());
		// test = extent.createTest(arg0.getCurrentXmlTest().getName());

		Reporter.log(arg0.getName() + " test started..");
		log.info(arg0.getName() + " test started..");
	}

	public void onFinish(ITestContext arg0) {
		// extent.flush();
		Reporter.log(arg0.getName() + " Test Finished");
		log.info(arg0.getName() + " Test Finished");
	}

}
