import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icvan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div[class='header-upper'] li:nth-child(7) a:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("div[class='header-upper'] li:nth-child(7) a:nth-child(1)")).click();
		//driver.close();
		//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//ul[@class ='navigation clearfix']/li[2]")).click();
		driver.findElement(By.xpath("//div[@class='header-top']//div[@class='login-btn']//a[@class='theme-btn register-btn']")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("//header/a[2]")).getText());
		
	}

}
