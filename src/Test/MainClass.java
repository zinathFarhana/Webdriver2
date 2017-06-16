package Test;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class MainClass {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		
		 System.setProperty("webdriver.ie.driver", "c://IEDriverServer.exe");
		  

         //DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 //caps.setCapability("ignoreZoomSetting", true)//;
		 
		
		WebDriver driver = new ChromeDriver();
		WebDriver frdriver = new FirefoxDriver();
		WebDriver iedriver= new InternetExplorerDriver();
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability("ignoreZoomSetting", true);
		
		
		String baseUrl = "http://newtours.demoaut.com";
		driver.get( baseUrl );
		frdriver.get( baseUrl );
		iedriver.get(baseUrl);

		 
//comment deleted
	       
	        // exit the program explicitly
	        System.exit(0);	
			
		
		
		
		
		
		
		
		

	}

}
