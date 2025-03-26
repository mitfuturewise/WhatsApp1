package swiftchat;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

public class Dashboard {
    public static WebDriver driver;
    public static BrowserMobProxy proxy;

    @BeforeClass
    public void setup() {
        if (driver == null) {
            try {
                System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

                // ✅ Start BrowserMob Proxy
                proxy = new BrowserMobProxyServer();
                proxy.start(8081);

                // ✅ Configure Proxy for WebDriver
                Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
                ChromeOptions options = new ChromeOptions();
                options.setProxy(seleniumProxy);
                options.addArguments("--start-maximized");

                // ✅ Initialize WebDriver
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                // ✅ Start capturing network traffic
                proxy.newHar("API Test");

                // Open Login Page
                driver.get("https://devwhatsapp.ifanow.in/login");

                // Perform Login
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mayur@futurewise.co.in");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Mayur@123");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//button[@type='submit']")).click();

                System.out.println("✅ WebDriver Initialized Successfully");
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("❌ Failed to initialize WebDriver");
            }
        }
    }

    @AfterClass
    public void tearDown() {
        if (proxy != null) {
            proxy.stop();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
