package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); 
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		//driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.findElement(By.id("email")).sendKeys("abcd@xyz.com");
		driver.findElement(By.id("pass")).sendKeys("password123");
		//driver.findElement(By.id("u_0_5_TX")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		//driver.close();
		//driver.quit();
		
	}

}
