package Loactor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SO_Xpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
	//	driver.get("https://sellonline.tataaia.com/wps/PA_TATAAIA_SO/#!/login/");
	//	driver.manage().window().maximize();
		
		//login
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("4101911");
	//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("T@lic12345");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//HB1
		driver.get("https://sellonline.tataaia.com/wps/PA_TATAAIA_SO/CampaignRedirection?campaign=HB1");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='N']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Amol");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("test");
		//driver.findElement(By.xpath("//input[@id='gen'][@value='1']")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("27-04-1996");
	}

}
