package variousConcepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\April2022_Selenium\\1st_Selenium_Project\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();
	}


}
