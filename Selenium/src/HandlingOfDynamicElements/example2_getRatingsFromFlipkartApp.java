package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getRatingsFromFlipkartApp {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 plus");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String raiting = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
		
		System.out.println(raiting);
		
		
	}

}
