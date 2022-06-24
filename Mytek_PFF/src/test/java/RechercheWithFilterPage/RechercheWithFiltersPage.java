package RechercheWithFilterPage;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class RechercheWithFiltersPage extends TestBase {
	

	
	//Locators Declaration
int  i;
By filter = By.xpath("//div["+i+"][contains(@role,'presentation')]");
By Filter_HomePage = By.xpath("//a[contains(@class,'has-sub-cat')]");
By Filter_Type = By.xpath("//li[contains(@class,'rootverticalnav nav-1 category-item')]/span");
By Pc_portable = By.xpath("//span[contains(text(),'Pc Portable')]");
By SelectFilterASUS = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/form/ol/li[3]/span");
By SelectFilterAPPLE = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/form/ol/li[2]/span");
By SelectFilterACER = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/form/ol/li[1]/span");
By SelectFilterDell = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/form/ol/li[4]/span");
By SelectAffichage= By.id("limiter");
By SelectitemName= By.xpath("//div[contains(@class,'desctopNameProduct')]");
By Displayed_item= By.xpath("//table["+i+"]/tbody/tr[contains(@class,'item product product-item product-item-info')]");
By ItemsTable = By.xpath("//ol[contains(@class,'products list items product-items')]");
By itemsNumber = By.xpath("//span[contains(@class,'toolbar-number')]");
By SelectFilterI5= By.xpath("//*[@id=\"narrow-by-list\"]/div[7]/div[2]/form/ol/li[4]/span"); 
By Validate_Filter = By.xpath("//button[contains(@title,'Appliquer les filtres')]");

//Constructor
public RechercheWithFiltersPage () {
	super();
	PageFactory.initElements(driver, this);
}

//Opening the page
public void OpenPage() {
	driver.navigate().to("https://www.mytek.tn");
}
//GotoFilterPage
public void ChooseFilterType () throws InterruptedException {
	driver.findElement(Filter_HomePage).click();
	driver.findElement(Filter_Type).click();
	Thread.sleep(1000);
	driver.findElement(Pc_portable).click();
	Thread.sleep(1000);
}

//ChooseFiltersPC
public void SelectitemsUsingMarqueFilters() throws InterruptedException {
	i=2;
	driver.findElement(By.xpath("//div["+i+"][contains(@role,'presentation')]")).click();
	Thread.sleep(2000);
	driver.findElement(SelectFilterACER).click();
	Thread.sleep(1000);
	driver.findElement(SelectFilterAPPLE).click();
	Thread.sleep(1000);
	driver.findElement(SelectFilterASUS).click();
	Thread.sleep(1000);
	//driver.findElement(SelectFilterDell).click();
	driver.findElement(Validate_Filter).click();
	Thread.sleep(1000);
}

//Test The filters
public void VerifyFilter() {
 driver.findElement(SelectAffichage).sendKeys("Tous");
int a = Integer.parseInt(driver.findElement(itemsNumber).getText());

 for (int i = 1; i<a; i++) {
	 String Item_description= driver.findElement(By.xpath("//table["+i+"]/tbody/tr[contains(@class,'item product product-item product-item-info')]")).getText();
	 if (Item_description.contains("ASUS")||Item_description.contains("APPLE")||Item_description.contains("ACER")) {
	 }
	 else driver.quit();
 }
 System.out.print("Le filtre de marque est fonctionnel \n");
 driver.close();
}
//Filter with processor type
public void SelectItemUsingProcessorFilter() throws InterruptedException {
	i=7;
	driver.findElement(By.xpath("//div["+i+"][contains(@role,'presentation')]")).click();
	driver.findElement(SelectFilterI5).click();
	driver.findElement(Validate_Filter).click();
	Thread.sleep(1000);
}

//Test Both filters
public void VrifyBothFilters() throws InterruptedException {
		 driver.findElement(SelectAffichage).sendKeys("Tous");
		int a = Integer.parseInt(driver.findElement(itemsNumber).getText());
		System.out.print(a+"\n");

		 for (int i = 1; i<a; i++) {
			 String Item_description= driver.findElement(By.xpath("//table["+i+"]/tbody/tr[contains(@class,'item product product-item product-item-info')]")).getText();
			 System.out.print(Item_description+"\n");
			 if (Item_description.contains("i5")&(Item_description.contains("ASUS")||Item_description.contains("APPLE")||Item_description.contains("ACER"))) {
				 Thread.sleep(200);
			 }
			 else driver.quit();
		 }
		 System.out.print("Le filtre de marque et de processeur sont fonctionnels \n");
		 driver.close();
}
}
