package Whatsapp1.copy;

import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class changes extends Login{
	
	public int useCaseIndex = 1;
	public String dayToSelect = "10";           // selected day from calendar
	public String timeToSelect = "18:00";       // selected time from dropdown
	public String expectedUrlBase;

	public String getImagePath() {
		return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\port.jpg";
    }
	public String getVideoPath() {
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\image.jpg";
    }
	public String getDocPath() {
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\image.jpg";
    }
	public changes() {
        this.expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
    }
}
