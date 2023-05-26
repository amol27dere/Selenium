package Loactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithText {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}

}
