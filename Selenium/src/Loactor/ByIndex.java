package Loactor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIndex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		
		//Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ABCD");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9898989898");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9898989898");
	}

}
