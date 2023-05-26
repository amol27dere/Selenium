package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBox2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/Xpath/ListBox/MultipleCheckBox.html");
		WebElement con= driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(con);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		
		//s.deselectAll();
		s.deselectByIndex(2);
		
		boolean result=s.isMultiple();
		if (result) {
			System.out.println("country list is multiple slecteable ");	
		}
		else {
			System.out.println("country list is not multiple slecteable ");
		}
		
		
		
		
	}

}
