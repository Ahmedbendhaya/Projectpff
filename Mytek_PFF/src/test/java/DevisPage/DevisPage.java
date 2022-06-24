package DevisPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import TestBase.TestBase;

public class DevisPage extends TestBase {
int i;
By btn_AddDevis= By.xpath("//button[contains(@title,'Ajouter au devis')]");
By btn_Devis= By.xpath("//a[contains(@title,'My Quote')]");
By btn_Counternull = By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div[3]/a/span[2]/span[1]");
By Btn_GoToDevisPage = By.xpath("//button[contains(text(),'DEMANDER UN DEVIS')]");
By Btn_GetDevis = By.xpath("//button[contains(text(),'Demander un devis')]");
By item = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody["+i+"]");
By Sous_total= By.xpath("//*[@id=\"shopping-cart-table\"]/tbody["+i+"]/tr/td/span/span/span");
By TotalPrice = By.xpath("//tr[contains(@class,'grand totals')]/td/strong/span");
By Check_Devis_Button = By.xpath("//a[contains(@class,'order-number')]");
By Devis_Display = By.xpath("//*[@id=\"my-orders-table\"]");
By Vider_devis = By.xpath("//span[contains(text(),'Vider son Devis')]");
By Element = By.xpath("//*[@id=\"form-validate\"]/div[1]");
By Block_form = By.xpath("//strong[contains(text(),'Entrez vos coordonnées')]");
By Block_form_mail = By.xpath("//input[contains(@id,'customer-email') and contains(@name,'username')]");
By Block_form_firstname = By.xpath("//input[contains(@name,'firstname') ]");
By Block_form_lastname = By.xpath("//input[contains(@name,'lastname') ]");
By Add_form = By.xpath("//div[contains(@class,'product-add-form')]");

public void AddToQuote() throws InterruptedException {
driver.findElement(btn_AddDevis).click();
Thread.sleep(2000);
}

public void GotoDevisPage() throws InterruptedException {
	driver.findElement(btn_Devis).click();
	Thread.sleep(2000);
	driver.findElement(Btn_GoToDevisPage).click();
	Thread.sleep(2000);
}
public void VerifyQuotePage() throws InterruptedException {
	
	i= 1;
	if(driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr["+i+"]")).isDisplayed()==true) {
		System.out.print("Item Added to quote");
	}
	else {
		System.out.print("Probléme d'ajout de l'article");
		driver.quit();
	}
	String a= driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr["+i+"]/td[4]/span/span/span")).getText();
	String b = driver.findElement(By.xpath("//tr[contains(@class,'grand totals')]/td/strong/span")).getText();
if (a.contentEquals(b)==true) {
	System.out.print("Le calcul a été effectué correctement \n");
}
else {
	System.out.print("Le calcul n'est pas effectué correctement \n");
	driver.quit();
}
Thread.sleep(1000);
}
public void GenerateQuote() throws InterruptedException {
	driver.findElement(Btn_GetDevis).click();
	Thread.sleep(1000);
}
public void verifyGeneration() throws InterruptedException {
	driver.findElement(Check_Devis_Button).click();
	if(driver.findElement(Devis_Display).isDisplayed()==true)
	{
		System.out.print("Quote generated \n");
		Thread.sleep(2000);
		System.out.print(driver.findElement(Devis_Display).getText());
		driver.close();
		
	}
	else {System.out.print("Quote not Generetad \n");
	driver.findElement(null);
	}
	}
public void VerifyQuotePageManyElements() throws InterruptedException {
	int Total=0;
	int element = driver.findElements(By.xpath("//table[contains(@id,'shopping-cart-table')]/tbody")).size();
	System.out.print("\n"+element+"\n");
	for(i=1;i<=element;i++) {
	if(driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody["+i+"]")).isDisplayed()==true) {
		System.out.print("Item Added to quote");
		}
	String a= driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody["+i+"]/tr[1]/td[4]/span/span")).getText().replaceAll("[^\\d]", "");
	a=a.trim();
	int price = Integer.parseInt(a);
	System.out.print(a);
	Total= Total+price;	
}
	System.out.print(Total);
String b = driver.findElement(By.xpath("//tr[contains(@class,'grand totals')]/td/strong/span")).getText().replaceAll("[^\\d]", "");
b=b.trim();
int Totalprice= Integer.parseInt(b);
if (Total==Totalprice) {
	System.out.print("\n Le calcul est  correct \n");
}
else {
	System.out.print("Le calcul n'est pas correct \n");
	driver.quit();
}
Thread.sleep(2000);
}
public void Empty() throws InterruptedException {

		GotoDevisPage();
		driver.findElement(Vider_devis).click();
		System.out.print("\n Vidage du devis \n");
}
public void verifyDisplayForm() {
	if (driver.findElement(Block_form).isDisplayed()==true) {
		System.out.print("\n Affichage du formulaire \n");
	}
	else System.out.print("\n Pas d affichage du formulaire");
			}
public void Formulaire(String mail, String firstname, String lastname) {
	driver.findElement(Block_form_mail).sendKeys(mail);
	driver.findElement(Block_form_firstname).sendKeys(firstname);
	driver.findElement(Block_form_lastname).sendKeys(lastname);
}
public void verifyDevisNotConnected() {
	String Url= driver.getCurrentUrl();
	if (Url.contains("https://www.mytek.tn/amasty_quote/cart/")) {
		System.out.print("\n non generation du devis");
		driver.findElement(null);
	}
	else System.out.print("\n Generation du devis \n");
}
public void VerifyNonStockItem() {
	if(driver.findElement(Add_form).getText().contains("Ajouter au devis")==false) {
		System.out.print("\n pas de disponibilite de l article dans le stock \n");
	}
	else {System.out.print("\n Bouton disponible BUG \n");
	driver.findElement(null);
	}
	
}

}
