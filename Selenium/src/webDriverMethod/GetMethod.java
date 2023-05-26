package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		driver.getCurrentUrl();
		String url= driver.getCurrentUrl();
		
		System.out.println(url);
		
		System.out.println(driver.getCurrentUrl());
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
