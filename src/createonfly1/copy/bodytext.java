package createonfly1.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bodytext extends Login {
    
    // Non-static method to remove non-BMP characters
    public String removeNonBMP(String input) {
        return input.codePoints()
                    .filter(cp -> cp <= 0xFFFF)  // Only keep BMP characters
                    .collect(StringBuilder::new,
                             StringBuilder::appendCodePoint,
                             StringBuilder::append)
                    .toString();
    }
    @Test
    // Non-static method that encapsulates the test logic
    public void bodytext(){
        // Initialize ChromeDriver (set the system property if needed)
        
//        String originalText = 
//        		"Dear User,\r\n"
//                + "\r\n"
//                + "On [SIP Drive Date], I’m hosting a once-in-a-year investment drive called SIP Ka Maha Kumbh!\r\n"
//                + "\r\n"
//                + "🌟 500+ SIPs in One Day! Be a part of this historic wealth movement.\r\n"
//                + "🔥 Join thousands of investors taking a bold step towards financial freedom!\r\n"
//                + "📌 Limited window – 24 hours only! Be one of my 500 SIP investors!\r\n"
//                + "👉 Click below to request a callback & lock in your spot!\r\n"
//                + "\r\n"
//                + "Thank you for choosing us.\r\n"
//                + "Sincerely,\r\n";
    	String originalText = 
    		     "Dear User,\r\n"
    		    + "\r\n"
    		    + "Your details\r\n"
    		    + "\r\n"
    		    + "{{1}},"
    		    + "\r\n"
    		    + "{{2}},"
    		    + "\r\n"
    		    + "{{3}},"
    		    + "\r\n"
    		    + "{{4}},"
    		    + "\r\n"
    		    + "{{5}},"
    		    + "\r\n"
    		    + "{{6}},"
    		    + "\r\n"
    		    + "{{7}},"
    		    + "\r\n"
    		    + "{{8}},"
    		    + "\r\n"
    		    + "{{9}},"
    		    + "\r\n"
    		    + "{{10}},"
    		    + "\r\n"
    		    + "{{11}},"
    		    + "\r\n"
//    		    + "{{12}},"
//    		    + "\r\n"
//    		    + "{{13}},"
//    		    + "\r\n"
//    		    + "{{14}},"
//    		    + "\r\n"
//    		    + "{{15}},"
//    		    + "\r\n"
//    		    + "{{16}},"
//    		    + "\r\n"
//    		    + "{{17}},"
//    		    + "\r\n"
//    		    + "{{18}},"
//    		    + "\r\n"
//    		    + "{{19}},"
//    		    + "\r\n"
//    		    + "{{20}},"
//    		    + "\r\n"
//    		    + "{{21}},"
//    		    + "\r\n"
//    		    + "{{22}},"
//    		    + "\r\n"
//    		    + "{{23}},"
//    		    + "\r\n"
//    		    + "{{24}},"
//    		    + "\r\n"
//    		    + "{{25}},"
//    		    + "\r\n"
//    		    + "{{26}},"
//    		    + "\r\n"
//    		    + "{{27}},"
//    		    + "\r\n"
//    		    + "{{28}},"
//    		    + "\r\n"
//    		    + "{{29}},"
//    		    + "\r\n"
//    		    + "{{30}},"
//    		    + "\r\n"
    		    + "Thank you for choosing us.\r\n"
    		    + "Sincerely,\r\n";
//    	String originalText = "Dear {{1}},\r\n"
//    			+ "We’re thrilled to share the news of your recent appraisal – congratulations! Your consistent hard work, commitment, and dedication have truly made a difference, and this recognition is well deserved.\r\n"
//    			+ "We value your contributions and look forward to your continued growth and success with us.\r\n"
//    			+ "Warm regards,\r\n"
//    			+ "{{2}}\r\n"; 
        // Remove non-BMP characters
        
        // Remove non-BMP characters
        String filteredText = removeNonBMP(originalText);
        
        // Send the filtered text to the textarea element
        driver.findElement(By.xpath("//textarea[@aria-required='false']")).sendKeys(filteredText);
        
    }

}
