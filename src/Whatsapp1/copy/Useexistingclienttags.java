package Whatsapp1.copy;
import java.awt.AWTException;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
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
//import Whatsapp.newcampaign;

@Listeners(TestListeners.class)
public class Useexistingclienttags extends Login{
	newcampaign createcamp = new newcampaign();
	wfnp wfnp = new wfnp();
	body body = new body();
	header header = new header();
	Buttons buttons = new Buttons();
	devtools devtools = new devtools();
	private final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";
//	@Test(priority = 1)
//	public void Useexistingclienttags() throws InterruptedException, AWTException {
//		TestListeners.setDriver(driver);
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.newCampaign();
//		Thread.sleep(1000);
//		header.wheaderisselectedasnone();
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.newCampaign();
//		Thread.sleep(1000);
//		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);	
//	}		
//		@Test(priority = 2)
//		public void Useexistingclienttags1() throws InterruptedException, AWTException {	
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.Useexistingclienttags();
//		Thread.sleep(1000);
//		header.wheaderisselectedasnone();
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.Useexistingclienttags();
//		Thread.sleep(1000);
//		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();;
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);
//}	
//		@Test(priority = 3)
//		public void Useexistingclienttags3() throws InterruptedException, AWTException {	
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.CreateTag();
//		Thread.sleep(1000);
//		header.wheaderisselectedasnone();
//		Thread.sleep(1000);
////		body.wselectdatapointandfallbackvalue();
////		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.CreateTag();
//		Thread.sleep(1000);
//		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();;
//		Thread.sleep(1000);
////		body.wselectdatapointandfallbackvalue();
////		Thread.sleep(1000);
//		buttons.wphonenumberbuttontextcontent();
//		Thread.sleep(1000);
//		devtools.devtools();	
//	}
	@Test(priority = 4)
	public void Useexistingclienttags4() throws InterruptedException, AWTException {
		TestListeners.setDriver(driver);
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wheaderisselectedasnone();
		Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		createcamp.verifyAndPublishCampaign(driver, newcampaign.uniqueCampaignName);
		Thread.sleep(1000);

		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();
		Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wimage1();
		Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);	
//		
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.schedule();
//		Thread.sleep(1000);
//		header.wvideo1();
//		Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);	
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wdocument1();
		Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wheaderisselectedasnone();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);

		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wimage1();
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);	
//		
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.schedule();
//		Thread.sleep(1000);
//		header.wvideo1();
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//	    Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);	
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wdocument1();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wheaderisselectedasnone();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
	    wfnp.footer();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);

		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wHeaderTextandAddVariablewithselectdapointandfallbackvalue();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
	    wfnp.footer();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wimage1();
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
	    wfnp.footer();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);	
//		
//		wfnp.whatsapp();
//		Thread.sleep(1000);
//		createcamp.schedule();
//		Thread.sleep(1000);
//		header.wvideo1();
//		Thread.sleep(1000);
//		body.wselectdatapointandfallbackvalue();
//	    Thread.sleep(1000);
//		devtools.devtools();
//		Thread.sleep(1000);	
		
		wfnp.whatsapp();
		Thread.sleep(1000);
		createcamp.schedule();
		Thread.sleep(1000);
		header.wdocument1();
		Thread.sleep(1000);
		body.wselectdatapointandfallbackvalue();
	    Thread.sleep(1000);
	    wfnp.footer();
	    Thread.sleep(1000);
		devtools.devtools();
		Thread.sleep(1000);
		
		
		
		
		
		
		
	}		
}
