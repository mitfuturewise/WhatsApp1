package createonfly1.copy;

import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class changes extends Login{
	
	public int useCaseIndex = 1;
	public String dayToSelect = "5";           // selected day from calendar
	public String timeToSelect = "2:00";       // selected time from dropdown
	public int totalDropdowns = 30; // Total number of dropdowns, adjust as needed
	public int startingOptionIndex = 31;

	public String getImagePath() {
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\image.jpg";
    }
	public String getVideoPath() {
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\image.jpg";
    }
	public String getDocPath() {
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\image.jpg";
    }
}
