package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		
		
		
		Actions act= new Actions(driver);
		
		
		act.moveToElement(login).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Wishlist']")).click();
		

 }
}
