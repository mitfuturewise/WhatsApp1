package createonfly;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(TestListeners.class)
	public class Buttons extends Login {
		public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
		public AtomicInteger responseStatus = new AtomicInteger(-1);
		newcampaign createcamp = new newcampaign();
		wfnp wfnp = new wfnp();
		bodytext bodytext = new bodytext();
		devtools devtools = new devtools();
	    public final String expectedUrlBase1 = "https://staging.ifanow.in/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
		
	    @Test(priority = 1)
		public void addwebsiteurl() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			devtools.devtools1();
		}
	    @Test(priority = 2)
		public void addwebsiteurlbuttontext() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("URL");
			devtools.devtools1();
		}
	    @Test(priority = 3)
		public void addwebsiteurlbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			bodytext.bodytext();
			Thread.sleep(1000);
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
		public void phonenumber() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select phonenumber
			devtools.devtools1();
		}
	    @Test(priority = 5)
		public void phonenumberbuttontext() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select phonenumber
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("Call");//enter text
			devtools.devtools1();
		}
	    @Test(priority = 6)
		public void phonenumberbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
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
		public void quickurl() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select quickreplybutton
			devtools.devtools1();
		
		}
	    @Test(priority = 8)
		public void quickurlbuttontextcontent() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			bodytext.bodytext();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select quickreplybutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])")).sendKeys("QuickReply");
			devtools.devtools();
		
		}
	    @Test(priority = 9)
	    public void testbuttonsclickwu() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(1000);
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
	    public void testbuttonsclickpn() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(1000);
	    	driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select websiteurlbutton
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select websiteurlbutton
	    }
	    @Test(priority =11)
	    public void testbuttonsclickqr() throws InterruptedException {
	    	TestListeners.setDriver(driver);
			wfnp.whatsapp();
			createcamp.Useexistingclienttags();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//click on dropdown of buttons
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select websiteurlbutton
	    }
}
