package createonfly1.copy;
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


@Listeners(TestListeners.class)
public class Useexistingclienttags extends Login{
    newcampaign createcamp = new newcampaign();
	wfnp wfnp = new wfnp();
	body body = new body();
	header header = new header();
	Buttons buttons = new Buttons();
	changes getData=new changes();
	devtools devtools = new devtools(getData);
//	changes getData=new changes();
	int useCaseIndex = getData.useCaseIndex;
	String dayToSelect =getData.dayToSelect;           // selected day from calendar
	String timeToSelect = getData.timeToSelect;
//  public final String expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
//  public final String expectedUrlBase = "https://staging.ifanow.in/futurewise/api/v1/web/whatsapp/campaign/create/template/onFly?";

		@Test(priority = 4)
		public void Useexistingclienttags4() throws InterruptedException, AWTException {
			TestListeners.setDriver(driver);
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.Useexistingclienttags(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.headerisselectedasnone();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.Useexistingclienttags(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.HeaderTextandAddVariablewithselectdapointandfallbackvalue();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.Useexistingclienttags(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.image1();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);

			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.Useexistingclienttags(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.document1();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.Useexistingclienttags(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.video1();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.schedule(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.headerisselectedasnone();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.schedule(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.HeaderTextandAddVariablewithselectdapointandfallbackvalue();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);	
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.schedule(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.image1();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);	
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.schedule(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.document1();
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			Thread.sleep(1000);
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			wfnp.whatsapp();
			Thread.sleep(1000);
			createcamp.schedule(dayToSelect, timeToSelect);
			Thread.sleep(1000);
			header.video1();	
			Thread.sleep(1000);
			body.selectdatapointandfallbackvalue();
		    Thread.sleep(1000);
			devtools.devtools();
			createcamp.verifyAndPublishCampaign(driver, createcamp.uniqueCampaignName);
			Thread.sleep(1000);
			
			
		}	
}
