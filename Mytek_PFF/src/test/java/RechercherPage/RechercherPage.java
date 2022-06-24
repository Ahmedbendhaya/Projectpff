package RechercherPage;

import static TestBase.TestBase.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class RechercherPage extends TestBase { 
	By Search_btn = By.id("search");
	By Item_displayed = By.className("amsearch-autocomplete-image");
	By VerifSuggestion = By.xpath("//div[contains(@class,'amsearch-results')]");
	
	public  RechercherPage () {
        super();
		PageFactory.initElements(driver, this);
	}
	
	public void OpenPage() {
		driver.navigate().to("https://www.mytek.tn");
	}
	public void Boxsearch() {
		driver.findElement(Search_btn).click();
	}
	
	
	public void AddSearchParameter(String parameter) throws InterruptedException {
		driver.findElement(Search_btn).sendKeys(parameter);
		Thread.sleep(2000);
		driver.findElement(Search_btn);
		Thread.sleep(2000);
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.SPACE);
		Thread.sleep(2000);	
		driver.findElement(Search_btn).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);	
		String a=driver.findElement(VerifSuggestion).getText();
		if (a.contains("PRODUIT")==true) {
		System.out.print("item found en utilisant le paramétre" +parameter);
		}
		else {
			System.out.print("item not found en utilisant le paramétre" +parameter);
			System.out.print("Echec du scenario");
			driver.quit();
		}
	}
		
		
	public void SelectElement() throws InterruptedException {
		driver.findElement(Item_displayed).click();
		Thread.sleep(2000);	
	}
	public void VerifyTheItemSelected(String URL) {
		String VerifyItem= driver.getCurrentUrl();
		if(VerifyItem.contains(URL)==true) {
			System.out.print("Article trouve en utilisant ce parametre");
			driver.close();
		}
		else {
			System.out.print("la page de l article n'est accesible");
			System.out.print("Echec du scenario");
			driver.close();
			}
	}
}