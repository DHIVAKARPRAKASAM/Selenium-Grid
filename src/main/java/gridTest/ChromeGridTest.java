package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		
		ChromeOptions option =new ChromeOptions();
		option.merge(cap);
		
		
		String hubUrl="http://192.168.1.26:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),option);
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	
}
