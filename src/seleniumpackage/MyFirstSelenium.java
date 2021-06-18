package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium {

	public static void main(String agrs[]) throws InterruptedException {
		

			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			driver.get("https://www.ups.com/lasso/login?");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}

	}

