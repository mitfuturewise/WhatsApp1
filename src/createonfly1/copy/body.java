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
	changes change = new changes();
//  public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
  public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
	
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
		int totalDropdowns =change.totalDropdowns; // Total number of dropdowns, adjust as needed
		int startingOptionIndex = change.startingOptionIndex;

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
		            case 11:
		                updatedText = updatedText.replaceFirst("\\{\\{11\\}\\}", selectedText + " - {{11}}");
		                break;
//		            case 12:
//		                updatedText = updatedText.replaceFirst("\\{\\{12\\}\\}", selectedText + " - {{12}}");
//		                break;
//		            case 13:
//		                updatedText = updatedText.replaceFirst("\\{\\{13\\}\\}", selectedText + " - {{13}}");
//		                break;
//		            case 14:
//		                updatedText = updatedText.replaceFirst("\\{\\{14\\}\\}", selectedText + " - {{14}}");
//		                break;
//		            case 15:
//		                updatedText = updatedText.replaceFirst("\\{\\{15\\}\\}", selectedText + " - {{15}}");
//		                break;
//		            case 16:
//		                updatedText = updatedText.replaceFirst("\\{\\{16\\}\\}", selectedText + " - {{16}}");
//		                break;
//		            case 17:
//		                updatedText = updatedText.replaceFirst("\\{\\{17\\}\\}", selectedText + " - {{17}}");
//		                break;
//		            case 18:
//		                updatedText = updatedText.replaceFirst("\\{\\{18\\}\\}", selectedText + " - {{18}}");
//		                break;
//		            case 19:
//		                updatedText = updatedText.replaceFirst("\\{\\{19\\}\\}", selectedText + " - {{19}}");
//		                break;
//		            case 20:
//		                updatedText = updatedText.replaceFirst("\\{\\{20\\}\\}", selectedText + " - {{20}}");
//		                break;
//		            case 21:
//		                updatedText = updatedText.replaceFirst("\\{\\{21\\}\\}", selectedText + " - {{21}}");
//		                break;
//		            case 22:
//		                updatedText = updatedText.replaceFirst("\\{\\{22\\}\\}", selectedText + " - {{22}}");
//		                break;
//		            case 23:
//		                updatedText = updatedText.replaceFirst("\\{\\{23\\}\\}", selectedText + " - {{23}}");
//		                break;
//		            case 24:
//		                updatedText = updatedText.replaceFirst("\\{\\{24\\}\\}", selectedText + " - {{24}}");
//		                break;
//		            case 25:
//		                updatedText = updatedText.replaceFirst("\\{\\{25\\}\\}", selectedText + " - {{25}}");
//		                break;
//		            case 26:
//		                updatedText = updatedText.replaceFirst("\\{\\{26\\}\\}", selectedText + " - {{26}}");
//		                break;
//		            case 27:
//		                updatedText = updatedText.replaceFirst("\\{\\{27\\}\\}", selectedText + " - {{27}}");
//		                break;
//		            case 28:
//		                updatedText = updatedText.replaceFirst("\\{\\{28\\}\\}", selectedText + " - {{28}}");
//		                break;
//		            case 29:
//		                updatedText = updatedText.replaceFirst("\\{\\{29\\}\\}", selectedText + " - {{29}}");
//		                break;
//		            case 30:
//		                updatedText = updatedText.replaceFirst("\\{\\{30\\}\\}", selectedText + " - {{30}}");
//		                break;
//		            case 31:
//		                updatedText = updatedText.replaceFirst("\\{\\{31\\}\\}", selectedText + " - {{31}}");
//		                break;
//		            case 32:
//		                updatedText = updatedText.replaceFirst("\\{\\{32\\}\\}", selectedText + " - {{32}}");
//		                break;
//		            case 33:
//		                updatedText = updatedText.replaceFirst("\\{\\{33\\}\\}", selectedText + " - {{33}}");
//		                break;
//		            case 34:
//		                updatedText = updatedText.replaceFirst("\\{\\{34\\}\\}", selectedText + " - {{34}}");
//		                break;
//		            case 35:
//		                updatedText = updatedText.replaceFirst("\\{\\{35\\}\\}", selectedText + " - {{35}}");
//		                break;
//		            case 36:
//		                updatedText = updatedText.replaceFirst("\\{\\{36\\}\\}", selectedText + " - {{36}}");
//		                break;
//		            case 37:
//		                updatedText = updatedText.replaceFirst("\\{\\{37\\}\\}", selectedText + " - {{37}}");
//		                break;
//		            case 38:
//		                updatedText = updatedText.replaceFirst("\\{\\{38\\}\\}", selectedText + " - {{38}}");
//		                break;
//		            case 39:
//		                updatedText = updatedText.replaceFirst("\\{\\{39\\}\\}", selectedText + " - {{39}}");
//		                break;
//		            case 40:
//		                updatedText = updatedText.replaceFirst("\\{\\{40\\}\\}", selectedText + " - {{40}}");
//		                break;
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
