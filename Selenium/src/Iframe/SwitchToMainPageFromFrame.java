package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMainPageFromFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
	}

}
