package Installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sellonline.tataaia.com/wps/PA_TATAAIA_SO/#!/login/");
		
		driver.close();
	}

}
