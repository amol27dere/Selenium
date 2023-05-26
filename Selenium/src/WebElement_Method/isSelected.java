package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a [contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='_8esa'][1]")).click();
		Thread.sleep(2000);
		
		boolean fe= driver.findElement(By.xpath("//input[@class='_8esa'][1]")).isSelected();
		
		if (fe) {
			System.out.println("female check box is selected ");
		}
		else {
			System.out.println("female check box is not selected ");

		}
	}

}
