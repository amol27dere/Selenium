package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
