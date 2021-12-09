import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke the browser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\icvan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http:\\www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\icvan\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();*/
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\icvan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http:\\www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 String p = driver.getPageSource();
	      System.out.println("Page Source is : " + p);
	      driver.close();
	}

}
