package PopUp;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get url
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allid = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(allid);
		String childwindo = al.get(1);
		
		driver.switchTo().window(childwindo);
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
	}

}
