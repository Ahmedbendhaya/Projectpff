package CommandePage;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommandePage {
	AndroidDriver driver;
By Cnx_Btn = By.className("user");
By Email_add = By.id("email");
By pass_add = By.id("pass");
By cnx_confirm = By.id("send2");
By Search_Bar = By.id("search");
By item_select = By.className("amsearch-autocomplete-information");
By Panier_add = By.xpath("//span[contains(text(),'Ajouter au panier')]");
By Panier_btn = By.xpath("//a[contains(@class,'action showcart')]");
By GotoshippingPage = By.id("top-cart-btn-checkout");
By ShippingHome = By.xpath("//input[contains(@value,'flatrate_flatrate')]");
By GotoPaymentPage = By.xpath("//button[contains(@class,'button action continue primary')]");
By Paymentonship = By.xpath("//input[contains(@id,'cashondelivery') and contains(@class,'radio')]");
By Validatecommand = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[3]/div[2]/div[4]/div/button/span");




public CommandePage(AndroidDriver driver) {
	super();
	this.driver = driver;
}
public void openPage() throws MalformedURLException {
	DesiredCapabilities caps = new DesiredCapabilities();

	caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ahmed1");
	WebDriverManager.chromedriver().setup();
	caps.setCapability("chromedriverExecutable", WebDriverManager.chromedriver().getDownloadedDriverPath());
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	driver.get("http://mytek.tn");
}

public void connexion() throws InterruptedException {
	driver.findElement(Cnx_Btn).click();
	Thread.sleep(2000);
	driver.findElement(Email_add).sendKeys("Ben.dhaya.ahmed.baha.eddine@hotmail.com");
	driver.findElement(pass_add).sendKeys("22080023A");
	driver.findElement(cnx_confirm).click();
}
public void search_item() throws InterruptedException {
	driver.findElement(Search_Bar).sendKeys("Asus");
	driver.findElement(Search_Bar).sendKeys(Keys.SPACE);
	Thread.sleep(2000);	
	driver.findElement(Search_Bar).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);	
	driver.findElement(Search_Bar).sendKeys(Keys.SPACE);
	Thread.sleep(2000);	
	driver.findElement(Search_Bar).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);	
}
public void Select_item() throws InterruptedException {
	driver.findElement(item_select).click();
	Thread.sleep(5000);
}
public void Addtobasket() throws InterruptedException {
	driver.findElement(Panier_add).click();
	Thread.sleep(2000);
}
public void GotocommandPage() throws InterruptedException {
	driver.findElement(Panier_btn).click();
	Thread.sleep(2000);
	driver.findElement(GotoshippingPage).click();
	Thread.sleep(10000);
}
public void ChooseShiptohome() throws InterruptedException {
	driver.findElement(ShippingHome).click();
	Thread.sleep(2000);
}
public void GotoPaymentPage() throws InterruptedException {
	driver.findElement(GotoPaymentPage).click();
	Thread.sleep(2000);
}
public void ChoosePayOnDelivery() throws InterruptedException {
	driver.findElement(Paymentonship).click();
	Thread.sleep(5000);
}
public void ValidateCommand() {
	driver.findElement(Validatecommand).click();

}
}
