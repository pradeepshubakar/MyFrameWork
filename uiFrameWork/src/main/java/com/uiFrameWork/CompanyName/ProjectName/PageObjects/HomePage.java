package com.uiFrameWork.CompanyName.ProjectName.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFrameWork.CompanyName.ProjectName.helper.action.ActionHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.assertion.VerificationHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.resource.ResourceHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.wait.WaitHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class HomePage {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(HomePage.class);
	WaitHelper waitHelper;
	ActionHelper actionHelper;

	@FindBy(xpath = "//div[.='My Naukri']")
	WebElement myNaukri;

	@FindBy(xpath = "/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[5]/a")
	WebElement logOut;
	
	@FindBy(xpath = "//div[.='Pradeep.B.S']")
	WebElement profileLink;
	
	@FindBy(xpath = "//input[@id='attachCV']")
	WebElement updateResume;
	
	@FindBy(xpath = "//*[@id='lazyAttachCV']/div/div/div[2]/div[1]/div[1]/div[1]/div/b")
	WebElement resumeUpdatedsuccessmsg;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElementClickable(logOut, ObjectReader.reader.getExplicitWait());
		log.info("HomePage object created");
		TestBase.logExtentReport("HomePage object created");
	}

	public void clickOnLogOut() throws InterruptedException {
		log.info("waiting for logOut..");
		TestBase.logExtentReport("waiting for logOut..");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"))).perform();
		log.info("mouse moved");
		Thread.sleep(2000);
		//waitHelper.waitForElement(logOut, 05);
		logOut.click();
	}
	
	public void clickOnProfileLink() {
		log.info("clinking on profile link..");
		TestBase.logExtentReport("clinking on profile link..");
		profileLink.click();
	}
	
	public void updateResume() {
		log.info("Updating resume..");
		TestBase.logExtentReport("Updating resume..");
		updateResume.sendKeys(ResourceHelper.getResourcePath("src/main/resources/configfile/resume.docx"));
		log.info("Updated resume successfully");
		TestBase.logExtentReport("Updated resume successfully");
	}
	
	public boolean verifyresumeupdated() {
		return new VerificationHelper(driver).isDisplayed(resumeUpdatedsuccessmsg);
	}
}
