package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionFrom_MultiSelectableListbox1 {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/ListBox/MultipleCheckBox.html");
		
		WebElement con= driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(con);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		System.out.println(con.getSize());
		
		List<WebElement> all =s.getAllSelectedOptions();
		
		 for(WebElement a1:all) {
			 
			 System.out.println(a1.getText());
		 }
		
		
	}

}
