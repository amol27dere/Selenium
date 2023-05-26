package Loactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_xpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd@xyc.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdf");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
