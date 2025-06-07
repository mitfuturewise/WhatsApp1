package createonfly;
import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListeners.class)
public class body extends Login {
	newcampaign createcamp = new newcampaign();
	wfnp wfnp = new wfnp();
	bodytext bodytext = new bodytext();
	devtools devtools = new devtools();
//    public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
    public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
	
    @Test(priority = 1)
	public void addvariable() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bodytext.bodytext();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		devtools.devtools1();
	}
    @Test(priority = 2)
    public void selectdatapoint() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bodytext.bodytext();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"datapoint\"])")).click();//select dropdown of datapoint
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select first option from datapoint dropdown
		
		Thread.sleep(1000);
		devtools.devtools1();
	}
    @Test(priority = 3)
    public void selectdatapointandfallbackvalue() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		createcamp.Useexistingclienttags();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		bodytext.bodytext();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"datapoint\"])")).click();//select dropdown of datapoint
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select first option from datapoint dropdown
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@formcontrolname=\"fallbackValue\"])")).sendKeys("user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@aria-required=\"false\"])[2]")).sendKeys("Thank you for choosing us.");
		Thread.sleep(1000);
		devtools.devtools();
    }
}
