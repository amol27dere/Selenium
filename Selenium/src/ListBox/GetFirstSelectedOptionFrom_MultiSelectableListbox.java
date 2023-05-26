package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionFrom_MultiSelectableListbox {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/ListBox/MultipleCheckBox.html");
		
		WebElement multi= driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s= new Select(multi);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		String first = s.getFirstSelectedOption().getText();
		
		System.out.println(first);
	}
}
