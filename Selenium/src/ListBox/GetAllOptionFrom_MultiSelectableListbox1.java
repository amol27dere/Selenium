package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionFrom_MultiSelectableListbox1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
	WebElement	month=driver.findElement(By.xpath("//select[@id='month']"));
	Select s= new Select(month);
	 List<WebElement> all =s.getOptions();
	 
	// System.out.println(all.size());
	 
	 int size=all.size();
	 System.out.println(size);
	 
	 
	 
	 for (WebElement a : all) {
		 System.out.println(a.getText());
		
	}
	
	}
	

}
