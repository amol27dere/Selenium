package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSugestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("iphone 14");
		Thread.sleep(2000);
		
		List<WebElement> allsu = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exptext = "iphone 14 plus price";
		
		for (WebElement a:allsu) {
			
			String acttext = a.getText();
			System.out.println(acttext);
			
			if(acttext.equals(exptext)) {
				
				a.click();
				break;
			}
			
			
		}
		
		
		
		
	}

}
