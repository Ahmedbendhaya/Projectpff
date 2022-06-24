package TestBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	   public static WebDriver driver;
	    public static Properties prop;
	    
	    public static void intialization() {
	    	String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is : "+projectPath);	
	        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().to("https://www.mytek.tn");
	    	}

	}
