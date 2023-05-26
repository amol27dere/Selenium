package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getReviwsFromFlipkartApp {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/"
				+ "");
		
		//close login
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//search for iphone 14 plus
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14 plus");
		//click submit
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//getreview
		String review = driver.findElement(By.xpath("((//a[@class='_1fQZEK'])[1]//span)[8]")).getText();
		System.out.println(review);
	}

}
