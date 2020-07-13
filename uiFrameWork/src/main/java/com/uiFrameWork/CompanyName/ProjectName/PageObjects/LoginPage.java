package com.uiFrameWork.CompanyName.ProjectName.PageObjects;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameWork.CompanyName.ProjectName.helper.assertion.VerificationHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.wait.WaitHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class LoginPage extends TestBase {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	
	@FindBy(xpath = "//div[.='Login']")
	WebElement logInLink;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter your active Email ID')]")
	WebElement UserName;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter your password')]")
	WebElement password;
	
	@FindBy(xpath = "//button[.='Login']")
	WebElement logInSubmit;
	
	@FindBy(xpath = "//div[.='Pradeep.B.S']")
	WebElement successLoginMsg;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElementClickable(logInLink, ObjectReader.reader.getExplicitWait());
		log.info("LoginPage object created");
		logExtentReport("LoginPage object created");
	}
	
	public void clickOnLoginInLink() {
		logInLink.click();
		log.info("clicked on login link");
		logExtentReport("clicked on login link");
	}
	
	public void enterUserName(String UserName) {
		log.info("entering email id..."+UserName);
		logExtentReport("entering email id..."+UserName);
		this.UserName.sendKeys(UserName);
	}
	
	public void enterPassword(String password) {
		log.info("entering password..."+password);
		logExtentReport("entering password..."+password);
		this.password.sendKeys(password);
	}
	
	public HomePage clickOnSubmit() {
		log.info("clicking on login submit button..");
		logExtentReport("clicking on login submit button..");
		logInSubmit.click();
		return new HomePage(driver);
	}
	
	public boolean verifySuccessLoginMsg() {
		return new VerificationHelper(driver).isDisplayed(successLoginMsg);
	}

	

}
