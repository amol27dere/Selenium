package ListBox;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionFrom_MultiSelectableListbox {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/ListBox/MultipleCheckBox.html");
		
		WebElement multi=driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(multi);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		
	 java.util.List<WebElement>	allselected =s.getAllSelectedOptions();
	 
	 System.out.println(allselected.size());
		
	 for(WebElement a:allselected) {
		 System.out.println(a.getText());
		 
		 
	 }
		
	}

}
