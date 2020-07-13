package com.uiFrameWork.CompanyName.ProjectName.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.uiFrameWork.CompanyName.ProjectName.helper.alert.AlertHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.assertion.AssertHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.assertion.VerificationHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.ChromeBrowser;
import com.uiFrameWork.CompanyName.ProjectName.helper.javaScript.JavaScriptHelper;
import com.uiFrameWork.CompanyName.ProjectName.helper.window.WindowHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class Demo extends TestBase {

	// private Logger log = LoggerHelper.getLogger(Demo.class);
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
	}

	@Test
	
	public void testLogin1() throws InterruptedException {
		// driver = new ChromeDriver();

//		 WindowHelper w = new WindowHelper(driver);
//		 JavaScriptHelper j = new JavaScriptHelper(driver);
//		 VerificationHelper v = new VerificationHelper(driver);
	//	driver.get("https://www.naukri.com/");
		//WebElement element1 = driver.findElement(By.xpath("//*[@id='limheight']/div[1]/ul/li[12]/ul/li[2]"));
	//	WebElement element2 = driver.findElement(By.xpath("//img[@itemprop='logo']"));
		/*j.scrollToElement(element1);
		j.zoomIn60Percentage();
		j.scrollUpByPixel(1500);
		j.scrollDownVertically();
		w.closeAllTabsAndSwitchToMainWindow();*/
	/*	v.getText(element2);
		v.getTitle();
		Thread.sleep(3000);
		
		driver.quit();*/
	}

	@Test
	public void testLogin2() {
		AssertHelper.makeTrue();
	}	

	@Test
	public void testLogin3() {
		//driver = new ChromeDriver();
		/*ChromeBrowser c= new ChromeBrowser();
		ChromeOptions options = c.getChromeOptions();
		c.getChromeDriver(options);*/
		AlertHelper a = new AlertHelper(driver);
		driver.get("file:///C:/Users/Prade/Desktop/pr.se/alertpopup.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		a.acceptAlert();
		driver.close();
		
	}
}
