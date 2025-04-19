package createonfly1.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class wfnp extends Login{
	@Test
	public void whatsapp() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement whatsapp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(.,\"WhatsApp\")])[3]")));//whatsapp click
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", whatsapp);
	        Thread.sleep(300);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", whatsapp);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,\"CAMPAIGNS\")]")).click();
	}
	@Test
	public void next() throws InterruptedException {
		driver.findElement(By.xpath("(//span[contains(.,\" NEXT STEP \")])[2]")).click();
	}
	@Test
	public void publish() {
		driver.findElement(By.xpath("(//span[contains(.,\" Publish \")])[2]")).click();
	}
	@Test
public void footer() {
	driver.findElement(By.xpath("(//input[@aria-required=\"false\"])[3]")).sendKeys("Thank you for choosing us.");//footer
    driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"selectedButtonType\"])")).click();//select button dropdown
    driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//choose first option from dropdown
    driver.findElement(By.xpath("(//input[@formcontrolname=\"buttonText\"])[1]")).sendKeys("Redirect");//add text to buttontext-
    driver.findElement(By.xpath("(//input[@formcontrolname=\"url\"])[1]")).sendKeys("https://google.com");//add buttontext url 
}
}
