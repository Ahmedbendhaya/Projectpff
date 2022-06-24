package LoginPage;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class LoginPage extends TestBase {
	By Cnx_btn= By.xpath("//a[contains(text(),'Connexion')]");
	By Mail_btn = By.xpath("//input[contains(@id,'mail') and contains (@name,'login')]");
	By Mdp_btn = By.xpath("//input[contains(@id,'pass') and contains (@name,'login')]");
	By Connect_btn = By.xpath("//button[contains(@type,'submit') and contains(@class,'action login primary') ]");
	
	public void GotoConnexionPage() {
		driver.findElement(Cnx_btn).click();
	}
	public void Login_information(String username, String password){	
			driver.findElement(Mail_btn).sendKeys(username);
			driver.findElement(Mdp_btn).sendKeys(password);
		}
	public void Connect_To_My_Account() {
		driver.findElement(Connect_btn).click();
	}
	public void Verif_Cnx(){
			String a = "https://www.mytek.tn/customer/account/login/referer/";
			String URL= driver.getCurrentUrl();
			GotoConnexionPage();
			if (URL.contains(a)==true) {
				driver.quit();
				System.out.print("Les données de connexion sont invalide \n");
			}
			else System.out.print("Les données de connexion sont valide et je suis connecté \n");
			}
			}
	
	

