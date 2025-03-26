package swiftchat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Listeners (TestListeners.class)
public class Create_Template extends Dashboard {
    bodytext bodytext = new bodytext();

    // ✅ Explicitly call setup() to initialize WebDriver
    public Create_Template() throws InterruptedException {
        if (driver == null) {
            setup();
        }
    }

    @Test(priority = 1)
    public void template() throws InterruptedException {
        // ✅ Double-check WebDriver is initialized
        if (driver == null) {
            throw new IllegalStateException("❌ WebDriver is still null. Ensure that Dashboard.setup() is executed first.");
        }

        TestListeners.setDriver(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(.,\"Create Template\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(.,\"Back\")]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(.,\"Create Template\")]")).click();
        Thread.sleep(1000);

        String templateName = generateUniqueTemplateName(20);
        WebElement inputField = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
        inputField.clear();
        inputField.sendKeys(templateName);

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[contains(.,\"Create Template\")])[2]")).click();
        Thread.sleep(1000);
    }

    public static String generateUniqueTemplateName(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}
