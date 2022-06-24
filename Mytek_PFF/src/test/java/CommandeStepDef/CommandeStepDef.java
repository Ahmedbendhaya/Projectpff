package CommandeStepDef;

import org.testng.annotations.Test;

import CommandePage.CommandePage;
import TestBase.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommandeStepDef extends TestBase {
	CommandePage commande = new CommandePage();	
	@Test
	@When("ajouter cet article au panier")
	public void ajouter_cet_article_au_panier() throws InterruptedException {
		commande.AdditemToPanier();
		commande.PasserVersPageCommande();
		commande.VerifyShippingPageDisplay();
	}
	@Test
	@When("Choisir le mode de livraison")
	public void choisir_le_mode_de_livraison() throws InterruptedException {
		
		commande.ChooseShippingMethodHome();
	}
	@Test
	@When("Choisir le mode de paiement")
	public void choisir_le_mode_de_paiement() {
	    commande.ChoosePaymentMethodCash(); 
	}
	@Test
	@Then("Le récapitulatif de la commande est affichee domicile")
	public void ma_commande_passe() {
	    commande.VerifyShippingAndPaymentMethod();
	}
	@Test
	@When("Choisir le mode de livraison Parcking drive")
	public void choisir_le_mode_de_livraisonDrive()  {
	commande.ChooseShippingMethodDrive();
	}
	@Then("Le récapitulatif de la commande est affichee")
	public void ma_commande_passe2() {
	    commande.VerifyShippingAndPaymentMethod2();
	}
}
