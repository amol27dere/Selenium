package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/HandlingMultipleElements/MultiCheckBox.html");
		
		List<WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
	//	for(WebElement c:allcheck) {
			
	//		c.click();	
			
	//	}
		
		for (int i=0; i<=allcheck.size()-1 ;i++) {
			
			allcheck.get(i).click();
		}
		
		
	}

}
