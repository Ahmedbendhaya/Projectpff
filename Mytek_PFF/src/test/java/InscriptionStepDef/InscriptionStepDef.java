package InscriptionStepDef;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import InscriptionPage.InscriptionPage;
import TestBase.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InscriptionStepDef extends TestBase {
			
		InscriptionPage cc= new InscriptionPage();
		@BeforeMethod
		@Given("Navigateur ouvert")
		public void navigateur_et_page() {
			intialization();
		}
		
		@And("Utilisateur dans la page de creation")
		public void utilisateur_dans_la_page_de_creation() {
			driver.navigate().to("https://www.mytek.tn/customer/account/create/");
		}
		@Test
		@When("^je_tape (.*) and (.*) and (.*) and (.*) and (.*)$")
		
		
		public void je_tape_prenom_et_nom_et_Email_MDP_et_MDP(String prenom , String nom, String Email,String MDP,String Confirmation_MDP) throws InterruptedException {
			
			cc.enterPrenom(prenom);
			cc.enterNom(nom);
			cc.enterEmail(Email);
			cc.enterMDP(MDP);
			cc.enterMDPC(Confirmation_MDP);
		}
		  @Test
		@And("je clique sur creer un compte")
		public void je_clique_sur_creer_un_compte() throws InterruptedException {
			cc.cliquer_cc();

		}
		  @Test
		@Then("^page d_acceuil ouverte avec (.*) and (.*) and (.*) and (.*) and (.*)$")
		public void page_d_acceuil_ouverte(String prenom , String nom, String Email,String MDP,String Confirmation_MDP )throws InterruptedException {
			

		cc.verif_cc(prenom, nom, Email, MDP, Confirmation_MDP);
		
		}
	}