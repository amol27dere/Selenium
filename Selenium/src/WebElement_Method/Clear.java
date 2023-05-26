package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		WebElement un =driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
		
		un.sendKeys("dhfghdsgfhgdshgfhsdghfh");
		
		Thread.sleep(2000);
		
		un.clear();
		
		
	}

}
