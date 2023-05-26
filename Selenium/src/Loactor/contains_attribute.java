package Loactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_attribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("ABCD");
		
		driver.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("65134");
		
		driver.findElement(By.xpath("//button[contains(@data-testid,royal_login)]")).click();;
	}

}
