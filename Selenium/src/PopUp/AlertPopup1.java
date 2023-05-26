package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("112");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		//alt.dismiss();
		alt.accept();
		alt.dismiss();
		
		//alt.accept();
		
	}

}
