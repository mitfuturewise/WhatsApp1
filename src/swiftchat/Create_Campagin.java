package swiftchat;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (TestListeners.class)
public class Create_Campagin extends Dashboard {
	private static int campaignCounter = 1;
	@Test(priority = 1)
public void campagin() throws InterruptedException {
		    TestListeners.setDriver(driver);
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		    // Click on 'Create Campaign'
		    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Campaign"))).click();

		    // Generate unique campaign name
		    if (campaignCounter > 100) campaignCounter = 1;
		    String uniqueCampaignName = "Campaign_" + campaignCounter++;
		    Thread.sleep(1000);
		    // Enter campaign name
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']"))).sendKeys(uniqueCampaignName);
		    Thread.sleep(1000);
		    // Select template
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Select Template')]"))).click();
		    Thread.sleep(1000);
		    WebElement templateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Select Template')]")));
		    templateDropdown.click();

		    // Select contact group
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Select Contacts')]"))).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@role='option'])[1]"))).click();

		    // Submit campaign
//		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])"))).click();
		}
	@Test(priority = 2)
	public void campaign1() throws InterruptedException {
		TestListeners.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[contains(.,\"Create Campaign\")]")).click();//click on create campaign
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(.,\"Back\")]")).click();//click on back button
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(.,\"Create Campaign\")]")).click();//click on create campaign
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("test");//Enter campaign name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(.,\"Select Template\")]")).click();//select template dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//li[@role=\"option\"])[5]")).click();//select 5th option from template dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//span[contains(.,\"Select Contacts\")]")).click();//select send to dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//li[@role=\"option\"])[1]")).click();//select 1st option from send to dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();//select Body variable dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//li[@role=\"option\"])[2]")).click();//select dynamic option from body variable dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();//click on select option dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//li[@role=\"option\"])[1]")).click();//select 1st option(first name) from select option dropdown
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@type=\"submit\"])")).click();//click on save button
	}
	@Test(priority = 3)
	public void campaign2() throws InterruptedException {
		TestListeners.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(.,\"Create Campaign\")]")).click();//click on create campaign
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[contains(.,\"Back\")]")).click();//click on back button
		 Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])")).sendKeys("Test");//click on search bar of campaign
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-haspopup=\"menu\"])[1]")).click();//select menu on campaign screen
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role=\"menuitem\"])")).click();//click on view campaign button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,\"Back\")]")).click();//click on back button
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(.,\"Chats\")])[2]")).click();//click on back button
	}
}