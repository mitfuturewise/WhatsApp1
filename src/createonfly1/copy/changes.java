package createonfly1.copy;

import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class changes extends Login{
	
	public int useCaseIndex = 25;
	public String dayToSelect = "10";           // selected day from calendar
	public String timeToSelect = "18:00";       // selected time from dropdown
	public int totalDropdowns = 11; // Total number of dropdowns, adjust as needed
	public int startingOptionIndex = 91;
	public String expectedUrlBase;

	public String getImagePath() {
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\16mb im,age port.jpg";//16mb 
          return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\port 5mb.jpg";//5mb
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\6mb occ1.jpg";//6mb
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\5kb occ.jpg";5mb
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\4mb port.png";4mb
    }
	public String getVideoPath() {
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\Clouds_34_Timelapse.mp4";//24mb
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\Video MP4_Lake - testfile.org.mp4"; //15.5mb
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\Video.mp4";//9mb
    }
	public String getDocPath() {
//        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\pushkar@pickle-jarinvestments.co.in_5802_0_1743676252710.dbf";//19mb
        return "C:\\Users\\HP\\Documents\\ifanow\\whatsapp Apis\\cas.pdf";//5mb
        
}
	public changes() {
        this.expectedUrlBase = "https://apis.ifanow.com/futurewise/api/v2/web/whatsapp/campaign/create/template/onFly?";
    }
}