package CommandePage;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class CommandePage extends TestBase {

	By Panier_Add_btn= By.xpath("//span[contains(text(),'Ajouter au panier')]");
	By Panier_btn = By.xpath("//a[contains(@class, 'action showcart')]");
	By Panier_Open = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");
	By Shipping_Home = By.xpath("//input[contains(@value,'flatrate_flatrate')]");
	By Payment_open = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
	By Payment_Cash = By.xpath("//input[contains(@id,'cashondelivery') and contains(@class,'radio')]");
	By Delivery_Drive =By.xpath("//input[contains(@name,'ko_unique_2')]");
	By Payment_Cheque = By.xpath("//input[contains(@id,'checkmo') and contains(@class,'radio')]");
	By Payment_validation = By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[3]/div[2]/div[4]/div/button/span");
	By Shipping_Type = By.xpath("//span[contains(@data-bind,'text: getShippingMethodTitle()')]");
	By Command_Success = By.xpath("//div[contains(@id,'opc-sidebar')]");
	
	public void AdditemToPanier() throws InterruptedException {
		driver.findElement(Panier_Add_btn).click();
		Thread.sleep(2000);
	}
	public void VerifyShippingPageDisplay() {
	if	(driver.getCurrentUrl().contains("https://www.mytek.tn/checkout/#shipping")==true) {
		System.out.print("\n Je suis a la page de paiement \n");
	}
	else {
		System.out.print("\n il ya un probléme \n");
		driver.quit();
	}
	}
	public void PasserVersPageCommande() throws InterruptedException {
		driver.findElement(Panier_btn).click();
		Thread.sleep(10000);
		driver.findElement(Panier_Open).click();
		Thread.sleep(3000);
	}
	public void ChooseShippingMethodHome() {
		driver.findElement(Shipping_Home).click();
	}
	public void VerifyShippingAndPaymentMethod() {
		if (driver.findElement(Shipping_Type).getText().contains("Livraison à domicile")==true)
		{
			System.out.print(" \n Le mode de livraison et le mode de paiement sont correct \n");
		}
		else { 
			System.out.print("\n Detection d un probleme dans le mode de livraison ou de paiement \n");
			driver.quit();
		}
	}
	public void ChoosePaymentMethodCash() {
		driver.findElement(Payment_open).click();
		driver.findElement(Payment_Cash).click();
	}
	public void ValidatePayment() {
		driver.findElement(Payment_validation).click();
	}
	public void VerifyCommandSuccess() {
		if (driver.findElement(Command_Success).isDisplayed()==true) {
			System.out.print("\n succes de la commande \n");
			driver.close();
		}
		else {
		System.out.print("\n Echec de la commande \n");
		}
	}
	public void ChooseShippingMethodDrive() {
		driver.findElement(Delivery_Drive).click();
	}
	public void VerifyShippingAndPaymentMethod2() {
		if (driver.findElement(Shipping_Type).getText().contains("Parking Drive")==true) 
		{
			System.out.print(" \n Le mode de livraison et le mode de paiement sont correct \n");
		}
		else { 
			System.out.print("\n Detection d un probleme dans le mode de livraison ou de paiement \n");
			driver.quit();
		}
}
}
