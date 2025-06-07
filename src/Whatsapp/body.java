package Whatsapp;
import java.awt.AWTException;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListeners.class)
public class body extends Login {
	newcampaign createcamp = new newcampaign();
	wfnp wfnp = new wfnp();
	devtools devtools = new devtools();
//  public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
  public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
	
    @Test(priority = 1)
	public void waddvariable() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		devtools.devtools1();
	}
    @Test(priority = 2)
    public void wselectdatapoint() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"datapoint\"])[3]")).click();//select dropdown of datapoint
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select first option from datapoint dropdown	
		Thread.sleep(1000);
		devtools.devtools1();
	}
    @Test(priority = 3)
    public void wselectdatapointandfallbackvalue() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"datapoint\"])[3]")).click();//select dropdown of datapoint
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select first option from datapoint dropdown
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"fallbackValue\"])[3]")).sendKeys("user");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@aria-required=\"false\"])[2]")).sendKeys("Thank you for choosing us.");
		devtools.devtools();
	}
}
