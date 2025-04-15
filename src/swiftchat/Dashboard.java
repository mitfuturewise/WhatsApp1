package swiftchat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners (TestListeners.class)
public class Dashboard {
	 public static WebDriver driver;
	@BeforeClass
	public void Dashboard() throws InterruptedException {
		TestListeners.setDriver(driver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://devwhatsapp.ifanow.in/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();//click on submit to check all field are required or not
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mayur@futurewise.co.in");//enter username
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Mayur");//enter pwd
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();//click on submit
		 
	}
}