package createonfly1.copy;
import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListeners.class)
public class body extends Login {
	newcampaign createcamp = new newcampaign();
	wfnp wfnp = new wfnp();
	bodytext bodytext = new bodytext();
    public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
	
    @Test(priority = 1)
	public void addvariable() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bodytext.bodytext();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
	}
    @Test(priority = 2)
    public void selectdatapoint() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bodytext.bodytext();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[contains(.,'Add Variable')])")).click();//click on add variable in body section
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-select[@formcontrolname=\"datapoint\"])")).click();//select dropdown of datapoint
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"mat-option-text\"])[1]")).click();//select first option from datapoint dropdown
	}
    @Test(priority = 3)
    public void selectdatapointandfallbackvalue() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		bodytext.bodytext();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement addVariable = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//p[contains(.,'Add Variable')])")));
//
//	    // Scroll into view and click safely
//	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addVariable);
//	    Thread.sleep(300);
//	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addVariable);
//		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		int totalDropdowns = 10; // Total number of dropdowns, adjust as needed
		int startingOptionIndex = 21;

		// First, execute the process to update the body text
		for (int i = 0; i < totalDropdowns; i++) {
		    int dropdownIndex = i + 1; // Because XPath is 1-based
		    int optionIndex = startingOptionIndex + i; // 6, 7, 8, ...

		    try {
		        System.out.println("Dropdown " + dropdownIndex + " → Option " + optionIndex);

		        // Open the i-th dropdown
		        WebElement dropdown = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//mat-select[@formcontrolname='datapoint'])[" + dropdownIndex + "]")));
		        dropdown.click();

		        // Select the dynamic option
		        WebElement option = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//mat-option[" + optionIndex + "]//span[@class='mat-option-text']")));
		        String selectedText = option.getText(); // Get the selected datapoint text
		        option.click();

		        // Optional: Fill the fallback value
		        WebElement input = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//input[@formcontrolname='fallbackValue'])[" + dropdownIndex + "]")));
		        input.sendKeys("Value_" + optionIndex); // Assign a fallback value

		        // Step 2: Update the body text with the selected datapoint
		        WebElement bodyText = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//textarea[@aria-required='false']"))); // Assuming the body placeholder is a <textarea> element with id 'body-placeholder'

		        String existingText = bodyText.getAttribute("value"); // Get the existing body text

		        // Initialize updated text with the existing text
		        String updatedText = existingText;

		        // Update the placeholder with the selected datapoint for the current dropdown
		        switch (dropdownIndex) {
		            case 1:
		                updatedText = updatedText.replaceFirst("\\{\\{1\\}\\}", selectedText + " - {{1}}");
		                break;
		            case 2:
		                updatedText = updatedText.replaceFirst("\\{\\{2\\}\\}", selectedText + " - {{2}}");
		                break;
		            case 3:
		                updatedText = updatedText.replaceFirst("\\{\\{3\\}\\}", selectedText + " - {{3}}");
		                break;
		            case 4:
		                updatedText = updatedText.replaceFirst("\\{\\{4\\}\\}", selectedText + " - {{4}}");
		                break;
		            case 5:
		                updatedText = updatedText.replaceFirst("\\{\\{5\\}\\}", selectedText + " - {{5}}");
		                break;
		            case 6:
		                updatedText = updatedText.replaceFirst("\\{\\{6\\}\\}", selectedText + " - {{6}}");
		                break;
		            case 7:
		                updatedText = updatedText.replaceFirst("\\{\\{7\\}\\}", selectedText + " - {{7}}");
		                break;
		            case 8:
		                updatedText = updatedText.replaceFirst("\\{\\{8\\}\\}", selectedText + " - {{8}}");
		                break;
		            case 9:
		                updatedText = updatedText.replaceFirst("\\{\\{9\\}\\}", selectedText + " - {{9}}");
		                break;
		            case 10:
		                updatedText = updatedText.replaceFirst("\\{\\{10\\}\\}", selectedText + " - {{10}}");
		                break;
		            // Add more cases if you have more placeholders to replace
		        }

		        // Step 3: Set the updated text back into the body without clearing the existing content
		        bodyText.clear(); // Clear existing text (to replace with updated content)
		        bodyText.sendKeys(updatedText); // Send the updated text with the selected datapoint

		    } catch (Exception e) {
		        System.out.println(":x: Error at Dropdown " + dropdownIndex + ", Option " + optionIndex + ": " + e.getMessage());

		        // Try to reset if dropdown hangs
		        try {
		            driver.findElement(By.tagName("body")).click();
		            Thread.sleep(200);
		        } catch (Exception ignored) {}
		    }
		}

		// Second part: After the body text has been updated, now continue to re-select all dropdown options
		for (int i = 0; i < totalDropdowns; i++) {
		    int dropdownIndex = i + 1; // Because XPath is 1-based
		    int optionIndex = startingOptionIndex + i; // 6, 7, 8, ...

		    try {
		        System.out.println("Dropdown " + dropdownIndex + " → Option " + optionIndex);

		        // Open the i-th dropdown
		        WebElement dropdown = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//mat-select[@formcontrolname='datapoint'])[" + dropdownIndex + "]")));
		        dropdown.click();

		        // Select the dynamic option
		        WebElement option = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//mat-option[" + optionIndex + "]//span[@class='mat-option-text']")));
		        String selectedText = option.getText(); // Get the selected datapoint text
		        option.click();

		        // Optional: Fill the fallback value
		        WebElement input = wait1.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("(//input[@formcontrolname='fallbackValue'])[" + dropdownIndex + "]")));
		        input.sendKeys("Value_" + optionIndex); // Assign a fallback value

		    } catch (Exception e) {
		        System.out.println(":x: Error at Dropdown " + dropdownIndex + ", Option " + optionIndex + ": " + e.getMessage());
		        
		        // Try to reset if dropdown hangs
		        try {
		            driver.findElement(By.tagName("body")).click();
		            Thread.sleep(200);
		        } catch (Exception ignored) {}
		    }
		}


		
	}
}
