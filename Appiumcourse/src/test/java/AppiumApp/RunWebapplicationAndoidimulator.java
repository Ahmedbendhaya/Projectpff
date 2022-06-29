package AppiumApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;



public class RunWebapplicationAndoidimulator {
	@SuppressWarnings("rawtypes")
	@Test
	public void OpenWebApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ahmed1");
		WebDriverManager.chromedriver().setup();
		caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getDownloadedDriverPath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.get("http://mytek.tn");
		driver.findElement(By.className("user")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Ben.dhaya.ahmed.baha.eddine@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("22080023A");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.id("search")).sendKeys("Asus");
		driver.findElement(By.id("search")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(By.id("search")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(By.id("search")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(By.id("search")).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(By.className("amsearch-autocomplete-information")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Ajouter au panier')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'action showcart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[contains(@value,'flatrate_flatrate')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'button action continue primary')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@id,'cashondelivery') and contains(@class,'radio')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[3]/div[2]/div[4]/div/button/span")).click();
		}
}
