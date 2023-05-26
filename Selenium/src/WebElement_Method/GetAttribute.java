package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws InterruptedException {


	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement un= driver.findElement(By.xpath("//input[@name='email']"));
	un.sendKeys("12121111112222");
	
	Thread.sleep(2000);
	
 String	valueq = un.getAttribute("value");
 
 System.out.println(valueq);
	
	

	}

}
