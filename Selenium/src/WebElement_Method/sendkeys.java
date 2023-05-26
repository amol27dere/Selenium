package WebElement_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		WebElement UN= driver.findElement(By.xpath("//input[@name='username']"));
		
		UN.sendKeys("Amoltest");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gdhfghdghfgd");
		
		Thread.sleep(2000);
		UN.clear();
		
		driver.findElement(By.xpath("//input[@type='password']")).clear(); 
		
		//driver.close();
	}

}
