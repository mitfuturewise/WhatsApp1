package createonfly1.copy;

import java.time.Duration;
import java.util.Optional;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class devtools extends Login {
//  public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
//    public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
	public AtomicInteger responseStatus = new AtomicInteger(-1);
	public String expectedUrlBase;
	public devtools(changes config) {
    this.expectedUrlBase = config.expectedUrlBase;
}
	public int getResponseStatus() {
        return responseStatus.get();
    }
	public void devtools() {
		TestListeners.setDriver(driver);
	    ChromeDriver chromeDriver = (ChromeDriver) driver;
	    DevTools devTools = chromeDriver.getDevTools();
	    devTools.createSession();

	    AtomicReference<String> expectedRequestId = new AtomicReference<>("");
	    responseStatus.set(-1); // Reset status before listening again

	    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

	    devTools.addListener(Network.requestWillBeSent(), requestEvent -> {
	        String requestUrl = requestEvent.getRequest().getUrl();
	        if (requestUrl.startsWith(expectedUrlBase)) {
	            expectedRequestId.set(requestEvent.getRequestId().toString());
	        }
	    });

	    devTools.addListener(Network.responseReceived(), responseReceived -> {
	        if (!responseReceived.getRequestId().toString().equals(expectedRequestId.get())) return;

	        Response res = responseReceived.getResponse();
	        try {
	        	  var requestId = responseReceived.getRequestId();
	            String body = devTools.send(Network.getResponseBody(requestId)).getBody();
	            JSONObject jsonResponse = new JSONObject(body);
	            int statusFromBody = jsonResponse.getInt("status");
	            responseStatus.set(statusFromBody);
	        } catch (Exception e) {
	            Reporter.log("Error: " + e.getMessage());
	        }
	    });

	    // ✅ Trigger API call
	    try {
	        WebElement triggerBtn = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,\" NEXT STEP \")])[2]")));
	        triggerBtn.click();
	    } catch (Exception e) {
	        Reporter.log("Trigger button not found: " + e.getMessage());
	    }

	    // ✅ Wait for API response
	    new WebDriverWait(driver, Duration.ofSeconds(30))
	        .until(d -> responseStatus.get() != -1);

	    // ✅ Wait for popup (if any) to appear & handle it before moving forward
	    try {
	        if (responseStatus.get() == 400 || responseStatus.get() == 500) {
	            WebDriverWait popupWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement popupClose = popupWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(.,' clear ')]")));
	            popupClose.click();

	            // ✅ Wait until popup is gone
	            popupWait.until(ExpectedConditions.invisibilityOf(popupClose));
	            Reporter.log("Test Passed");
	        } else {
	        	WebElement nextBtn = driver.findElement(By.xpath("(//span[contains(.,\" Yes \")])[2]"));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
	            nextBtn.click();
	            Thread.sleep(10000);
	            // ✅ Wait for next UI element to confirm this step finished
	            new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='textZindex']")))
	                .click();
	            new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(.,\"Publish\")])[2]")))
                .click();
	            
	            Reporter.log("Test Failed");
	        }
	    } catch (Exception e) {
	        Reporter.log("Error handling UI after response: " + e.getMessage());
	    }
	}
	public void devtools1() {
		  TestListeners.setDriver(driver);
		    ChromeDriver chromeDriver = (ChromeDriver) driver;
		    DevTools devTools = chromeDriver.getDevTools();
		    devTools.createSession();

		    AtomicReference<String> expectedRequestId = new AtomicReference<>("");
		    responseStatus.set(-1); // Reset status before listening again

		    devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		    devTools.addListener(Network.requestWillBeSent(), requestEvent -> {
		        String requestUrl = requestEvent.getRequest().getUrl();
		        if (requestUrl.startsWith(expectedUrlBase)) {
		            expectedRequestId.set(requestEvent.getRequestId().toString());
		        }
		    });

		    devTools.addListener(Network.responseReceived(), responseReceived -> {
		        if (!responseReceived.getRequestId().toString().equals(expectedRequestId.get())) return;

		        Response res = responseReceived.getResponse();
		        try {
		        	  var requestId = responseReceived.getRequestId();
		            String body = devTools.send(Network.getResponseBody(requestId)).getBody();
		            JSONObject jsonResponse = new JSONObject(body);
		            int statusFromBody = jsonResponse.getInt("status");
		            responseStatus.set(statusFromBody);
		        } catch (Exception e) {
		            Reporter.log("Error: " + e.getMessage());
		        }
		    });

		    // ✅ Trigger API call
		    try {
		        WebElement triggerBtn = new WebDriverWait(driver, Duration.ofSeconds(10))
		            .until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(.,\" NEXT STEP \")])[2]")));
		        triggerBtn.click();
		    } catch (Exception e) {
		        Reporter.log("Trigger button not found: " + e.getMessage());
		    }

		    // ✅ Wait for API response
		    new WebDriverWait(driver, Duration.ofSeconds(30))
		        .until(d -> responseStatus.get() != -1);

		    // ✅ Wait for popup (if any) to appear & handle it before moving forward
		    try {
		        if (responseStatus.get() == 400 || responseStatus.get() == 500) {
		            WebDriverWait popupWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		            WebElement popupClose = popupWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[contains(.,' clear ')]")));
		            popupClose.click();

		            // ✅ Wait until popup is gone
		            popupWait.until(ExpectedConditions.invisibilityOf(popupClose));
		            Reporter.log("Test Passed");
		        } else {
		        	WebElement nextBtn = driver.findElement(By.xpath("(//span[contains(.,\" Yes \")])[2]"));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextBtn);
		            nextBtn.click();
		            Thread.sleep(10000);
		            // ✅ Wait for next UI element to confirm this step finished
		            new WebDriverWait(driver, Duration.ofSeconds(10))
		                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='textZindex']")))
		                .click();
		            new WebDriverWait(driver, Duration.ofSeconds(10))
	                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[contains(.,\"Publish\")])[2]")))
	                .click();
		            
		            Reporter.log("Test Failed");
		        }
		    } catch (Exception e) {
		        Reporter.log("Error handling UI after response: " + e.getMessage());
		    }
	}
}
