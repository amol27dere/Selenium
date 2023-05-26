package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDropDown1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(login).perform();
		
		driver.findElement(By.xpath("//div[@class='_3vhnxf']")).click();
		
		
	}

}
