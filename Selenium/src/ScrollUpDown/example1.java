package ScrollUpDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/");
		
		WebElement title = driver.findElement(By.xpath("//span[text()='Energy used today (MWh), of which:']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",title);
		
		//thread
		
		WebElement birth = driver.findElement(By.xpath("//span[text()='Births this year']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",birth);
		
		
	}

}
