package HandlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectAprUsingEndKey {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act= new Actions(driver);
		act.click(month).perform();
		act.sendKeys(Keys.END).perform();
		
		for(int i=0;i<=7;i++) {
			act.sendKeys(Keys.UP).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
