package browserfactory;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class OpenBrowser {
	public static void main(String[] args) {  
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		// Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          //Launch Google.com
        driver.navigate().to("http://www.google.com");
        //maximize the window
        driver.manage().window().maximize();
	}
}
