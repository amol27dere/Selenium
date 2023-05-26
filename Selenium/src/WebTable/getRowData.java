package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowData {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\WebTable\\table.html");
		
		List<WebElement> row1 = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td"));
		
		System.out.println(row1.size());
		
		//get row data 
		String row3 = driver.findElement(By.xpath("(//table[@id='1234']//tr)[4]")).getText();
		
		System.out.println(row3);
	}

}
