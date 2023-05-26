package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOnly5Boxes {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/HandlingMultipleElements/MultiCheckBox.html");
		 
		List<WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i=0;i<=4;i++) {
			
			allcheck.get(i).click();
			
		}
		
	}

}
