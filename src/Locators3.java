import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\icvan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).click();
		//driver.close();
		//window navigation 
		driver.get("http://www.google.com");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
