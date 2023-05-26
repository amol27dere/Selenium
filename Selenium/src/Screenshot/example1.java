package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File dest= new File("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ScreenShot\\abc.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
