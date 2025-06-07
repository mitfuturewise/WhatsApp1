package Whatsapp1.copy;

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

import Whatsapp.newcampaign;

@Listeners(TestListeners.class)
public class header extends Login{
newcampaign createcamp = new newcampaign();
wfnp wfnp = new wfnp();
changes change = new changes();

//public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
@Test(priority = 1)
public void wheaderisselectedasnone() throws InterruptedException, AWTException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select text from header dropdown
}
@Test(priority = 2)
public void wtextWithoutenteringanytext() throws InterruptedException, AWTException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select text from header dropdown
}
@Test(priority = 3)
public void wtestWithFallbackValue() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//select text from header dropdown
	 driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[4]"))
     .sendKeys("FallbackValue");
}

@Test(priority = 4)
public void wHeaderTextandAddVariable() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//enter text to header dropdown
	 driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[4]"))
     .sendKeys("FallbackValue");
	 driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])[1]")).click();//click on add variable
}
@Test(priority = 5)
public void wHeaderTextandAddVariablewithselectdapoint() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//enter text to header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[4]"))
     .sendKeys("FallbackValue");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])[1]")).click();//click on add variable
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"headerPlaceholdervariable\"])")).click();//click to select datapoint
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//click to select 1st datapoint
}
@Test(priority = 6)
public void wHeaderTextandAddVariablewithselectdapointandfallbackvalue() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[2]")).click();//enter text to header dropdown
	 Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[4]"))
     .sendKeys("FallbackValue");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])[1]")).click();//click on add variable
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"headerPlaceholdervariable\"])")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//click to select 1st datapoint
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//input[@formcontrolname=\"headerFallbackvalue\"])")).sendKeys("Fallbackvalue");//add text to fallbackvalue
}
@Test(priority = 7)
public void wimage() throws InterruptedException {
	TestListeners.setDriver(driver);
	wfnp.whatsapp();
	Thread.sleep(1000);
	createcamp.newCampaign();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select image option from header dropdown
}
@Test(priority = 8)
public void wimage1() throws InterruptedException, AWTException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[3]")).click();//select image option from header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(.,\"Upload\")]")).click();
	Robot robot = new Robot();
	StringSelection selection = new StringSelection( change.getImagePath());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    
    // Paste the file path: CTRL+V
    robot.keyPress(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    // Press Enter to confirm the file upload.
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);	
}
@Test(priority = 9)
public void wvideo() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[4]")).click();//select image option from header dropdown	
}
@Test(priority = 10)
public void wvideo1() throws InterruptedException, AWTException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[4]")).click();//select video option from header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(.,\"Upload\")]")).click();
	Robot robot = new Robot();
	StringSelection selection = new StringSelection(change.getVideoPath());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    
    // Paste the file path: CTRL+V
    robot.keyPress(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    // Press Enter to confirm the file upload.
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);
}
@Test(priority = 11)
public void wdocument() throws InterruptedException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[5]")).click();//select image option from header dropdown
}
@Test(priority = 12)
public void wdocument1() throws InterruptedException, AWTException {
	TestListeners.setDriver(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//mat-select[@aria-disabled='false'])[2]")).click();//select header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[5]")).click();//select video option from header dropdown
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(.,\"Upload\")]")).click();
	Robot robot = new Robot();
	StringSelection selection = new StringSelection( change.getDocPath());
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    
    // Paste the file path: CTRL+VC:\Users\HP\Documents\ifanow\whatsapp Apis\document.pdf
    
    
    robot.keyPress(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    // Press Enter to confirm the file upload.
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
