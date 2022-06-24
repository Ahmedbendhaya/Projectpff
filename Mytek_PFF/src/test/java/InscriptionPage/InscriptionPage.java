package InscriptionPage;

	import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

	public class InscriptionPage extends TestBase {
		
		public InscriptionPage () {
			super();
			PageFactory.initElements(driver, this);
		}

		
	//entrer prenom
		public void enterPrenom(String prenom) {driver.findElement(By.id("firstname")).sendKeys(prenom); }
	//entrer nom  
		public void enterNom(String nom) {driver.findElement(By.id("lastname")).sendKeys(nom);}
	//entrer Email
		public void enterEmail(String Email) {driver.findElement(By.id("email_address")).sendKeys(Email);}
	//entrer Mot de pase
		public void enterMDP(String MDP) {driver.findElement(By.id("password")).sendKeys(MDP);}
	//confirmation de mot de passe  
		public void enterMDPC(String Confirmation_MDP) {driver.findElement(By.id("password-confirmation")).sendKeys(Confirmation_MDP);}
	///validation methode

		public void cliquer_cc() {
		driver.findElement(By.xpath("//button[contains(@class,'action submit primary')]")).click();
	}
		
		public void verif_cc(String prenom , String nom, String Email,String MDP,String Confirmation_MDP){
			
			String URL="https://www.mytek.tn/customer/account/";
			String VerifyCC= driver.getCurrentUrl();
			
					if(VerifyCC.contentEquals(URL)==true) {
		
						if  (((prenom.isEmpty()==true)||(prenom.matches(".*[0-9].*")==true))) {System.out.print("////////////////COMPTE CREE AVEC preNOM NON VALIDE///////////////// "); driver.findElement(null);}
					
					
						 if  (((nom.isEmpty()==true)||(nom.matches(".*[0-9].*")==true))) {System.out.print("////////////////COMPTE CREE AVEC NOM NON VALIDE///////////////// "); driver.findElement(null);}
					
					
						 String aero="@";String g1="gmail.com";String g2="gmail.tn";String g3="gmail.fr";String t1="talan.com";String t2="talan.tn";String t3 ="talan.fr";
						 
						 
	                          if ( (Email.isEmpty()==true)||(Email.contains(aero))==false) {
							 System.out.print("EMAIL NON VALIDE "); driver.findElement(null);}
							 
						 if((Email.contains(g1)==false)&&(Email.contains(g2)==false)&&(Email.contains(g3)==false)&&(Email.contains(t1)==false)&&(Email.contains(t2)==false)&&(Email.contains(t3)==false)) {
							 System.out.print("EMAIL NOT LOGIC BLA BLA BLA!!!!!!!!!!!!!!!!!! "); driver.findElement(null);}
	                if ((MDP.isEmpty()==true)||(MDP.length()<=8==true)) { System.out.print("//////////////////////////MDP NON VALIDE///////////////// ");driver.findElement(null);}
	             //   if ((Confirmation_MDP.isEmpty()==true)||Confirmation_MDP!=MDP==true) { System.out.print("////////////////////MDP non conforme//////////////////");driver.findElement(null);}
	                if ((Confirmation_MDP.isEmpty()==true)||Confirmation_MDP.contentEquals(MDP)==false) { System.out.print("////////////////////MDP non conforme//////////////////");driver.findElement(null);}
					}
					if(VerifyCC.contentEquals(URL)==true) {System.out.print("////////////////COMPTE CREE AVEC SUCCES/////////////////////");}
					//if(VerifyCC.contentEquals(URL)==true)	{System.out.print("////////////COMPTE CREE //////////// ");}
					
		/////////////////////////////////////////NON CREATION D UN COMPTE AVEC DES DONNEES INVALIDE//////////////////////////////////////////////////////////////////////////////////////	
			
			 if(VerifyCC.contentEquals(URL)==false)  {	if  (((prenom.isEmpty()==true)||(prenom.matches(".*[0-9].*")==true))) {}
				
				
			 if  (((nom.isEmpty()==true)||(nom.matches(".*[0-9].*")==true))) { }
		
		
			 String aero="@";String g1="gmail.com";String g2="gmail.tn";String g3="gmail.fr";String t1="talan.com";String t2="talan.tn";String t3 ="talan.fr";
			 
			 
	              if ( (Email.isEmpty()==true)||(Email.contains(aero))==false) {
				 }
				 
			 if((Email.contains(g1)==false)&&(Email.contains(g2)==false)&&(Email.contains(g3)==false)&&(Email.contains(t1)==false)&&(Email.contains(t2)==false)&&(Email.contains(t3)==false)) {
				 }
	    if ((MDP.isEmpty()==true)||(MDP.length()<=8==true)) { }
	    if ((Confirmation_MDP.isEmpty()==true)||Confirmation_MDP!=MDP==true) {  System.out.print("////////////////LA NON CREATION EST COMPTE EST CORRECTE/////////////////////");}
	        }
	   
		}
		

	 }
	
		
	