package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBox1 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/Xpath/ListBox/MultipleCheckBox.html");
		
	WebElement	con= driver.findElement(By.xpath("//select[@multiple='true']"));
	
	Select s= new Select(con);
	
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByVisibleText("UK");
	
	
	
	
	
	
	}

}
