package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean logo= driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		
		if (logo==true) // if (logo)
		{
			System.out.println("FB logo is present");
			
		}
		else {
			System.out.println("Fb logo is not present");
		}
		
		//boolean logo1=logo.isDisplayed();
		
		//System.out.println(logo1);
	}

}
