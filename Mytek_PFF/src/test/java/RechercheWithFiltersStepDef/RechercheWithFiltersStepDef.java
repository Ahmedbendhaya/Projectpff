package RechercheWithFiltersStepDef;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import RechercheWithFilterPage.RechercheWithFiltersPage;
import TestBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RechercheWithFiltersStepDef extends TestBase {
	RechercheWithFiltersPage Filters =new RechercheWithFiltersPage();	
	
	@BeforeMethod
	@Given("Je suis dans MyTek")
	public void je_suis_dans_MyTek() {
			intialization();
	}
	
	@Test
	@When("Je clique sur le type de l article PC Portable")
	public void je_clique_sur_le_type_de_l_article_PC_Portable() throws InterruptedException {
		Filters.ChooseFilterType();
	}
	@Test
	@When("je choisis le filtre")
	public void je_choisis_le_filtre() throws InterruptedException {
		Filters.SelectitemsUsingMarqueFilters();
	}
	@Test
	@Then("seulement les articles en relation avec ce filtre doivent s afficher")
	public void seulement_les_articles_en_relation_avec_ce_filtre_doivent_s_afficher() {
		Filters.VerifyFilter();
	}
	@When("je choisis les filtres")
	public void je_choisis_les_filtres() throws InterruptedException {
		Filters.SelectItemUsingProcessorFilter();
		Filters.SelectitemsUsingMarqueFilters();
	}

	@Then("seulement les articles en relation avec les filtres doivent s afficher")
	public void seulement_les_articles_en_relation_avec_les_filtres_doivent_s_afficher() throws InterruptedException {
		Filters.VrifyBothFilters();
	}

}
