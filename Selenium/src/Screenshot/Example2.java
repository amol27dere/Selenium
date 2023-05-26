package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 
		 File src = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File ("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ScreenShot\\abc1.jpg");
		 
		 org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
