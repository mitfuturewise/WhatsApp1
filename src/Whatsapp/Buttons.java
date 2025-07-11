package Whatsapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(TestListeners.class)
	public class Buttons extends Login {
//	    public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
	    public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
		public AtomicInteger responseStatus = new AtomicInteger(-1);
		newcampaign createcamp = new newcampaign();
		wfnp wfnp = new wfnp();
		devtools devtools = new devtools();
	  
		
	    @Test(priority = 1)
		public void waddwebsiteurl() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			devtools.devtools1();
		
		}
	    @Test(priority = 2)
		public void waddwebsiteurlbuttontext() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("URL");
			devtools.devtools1();
		
		}
	    @Test(priority = 3)
		public void waddwebsiteurlbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("URL");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"url\"])[1]")).sendKeys("https://my-planner.in/login");
			Thread.sleep(1000);
			devtools.devtools();
		
		}
	    @Test(priority = 4)
		public void wphonenumber() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select phonenumber
			devtools.devtools1();
		
		}
	    @Test(priority = 5)
		public void wphonenumberbuttontext() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select phonenumber
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("Call");//enter text
			devtools.devtools1();
		
		}
	    @Test(priority = 6)
		public void wphonenumberbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select phonenumber
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("Call");//enter text
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"phone\"])[1]")).sendKeys("9834549528");
			devtools.devtools();
		
		}
	    @Test(priority = 7)
		public void wquickurl() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select quickreplybutton
			devtools.devtools1();	
		
		}
	    @Test(priority = 8)
		public void wquickurlbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select quickreplybutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])")).sendKeys("QuickReply");
			devtools.devtools();
		
		}
	    @Test(priority = 9)
	    public void wtestbuttonsclickwu() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton			
	    }
	    @Test(priority = 10)
	    public void wtestbuttonsclickpn() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select websiteurlbutton
	    }
	    @Test(priority =11)
	    public void wtestbuttonsclickqr() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
	    }
}