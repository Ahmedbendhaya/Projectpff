import pytest
from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from Config.config import TestData
from Pages.HomePage import HomePage
from selenium import webdriver
from Tests import conftest

class LoginPage(BasePage):

    #Locators
    Email= (By.ID,"inputEmail")
    Password=(By.ID,"inputPassword")
    LoginButton=(By.XPATH,"//button[contains(text(),'Se connecter')]")
    ResetButton=(By.ID,"ResetPassword")
    InscriptionPageBtn=(By.ID,"goRegistrationBtn")
    HeaderConnexion=(By.CLASS_NAME,"gradient-bg")
    forgetpass_Email_textbox=(By.ID,"form_email")
    forgetpass_emailvalidation_btn=(By.XPATH,"//button[contains(text(),'Valider')]")
    gotoConnexionPage_btn=(By.XPATH,"//a[contains(@class,'d-block login-links pt-3 pb-2 login-btn-modal')]")
    Verif_display_ForgetPage=(By.XPATH,"//div[contains(@class,'popup-text text-center')]/h2")
    GotocnxPage=(By.XPATH,"//a[contains(text(),'Connexion') and contains (@data-target,'#myModal')]")
    DcxBtn=(By.XPATH,"//i[contains(@class,'fas fa-sign-out-alt')]")
    Invalid_Reset_Mail=(By.XPATH,"//div[contains(@class,'alert alert-danger mb-0')]")
    Valid_Reset_Mail=(By.XPATH,"//div[contains(@class,'alert alert-success mb-0')]")
    Cnx=(By.XPATH,"//a[contains(text(),'Connexion') and contains (@data-target,'#myModal')and contains(@class,'a-new')]")

    # initialization function
    def __init__(self,driver):
        super().__init__(driver)
        self.driver=driver

    # Opening of the login page
    def go_to_login_page(self):
        self.do_click(self.GotocnxPage)
    #Getting the login page title
    def get_login_page_title(self,title):
        return self.get_login_page_title(self,title)

    def is_signup_link_exist(self):
        return self.is_visible(self.HeaderConnexion)

    def do_login(self,Mail,Pass):
        self.do_click(self.GotocnxPage)
        self.do_send_keys(self.Email,Mail)
        self.do_send_keys(self.Password,Pass)
        self.do_click(self.LoginButton)


    def do_login_invalid(self,Mail,Pass):
        #self.do_click(self.GotocnxPage)
        self.do_send_keys(self.Email, Mail)
        self.do_send_keys(self.Password, Pass)
        self.do_click(self.LoginButton)
        return self.is_visible(self.HeaderConnexion)

    def Reset_page(self):
        self.do_click(self.ResetButton)
        return self.is_visible(self.Verif_display_ForgetPage)

    def Reset_Pass_Invalid_Mail(self,Mail):
        self.do_send_keys(self.forgetpass_Email_textbox,Mail)
        self.do_click(self.forgetpass_emailvalidation_btn)
        return self.is_visible(self.Invalid_Reset_Mail)

    def Reset_Pass_Valid_Mail(self,Mail):
        self.do_send_keys(self.forgetpass_Email_textbox,Mail)
        self.do_click(self.forgetpass_emailvalidation_btn)
        return self.is_visible(self.Valid_Reset_Mail)

    def Inscription_Page(self):
        self.do_click(self.InscriptionPageBtn)
        return self.verify_url(TestData.URL_Inscription)

    def Return_To_Connexion_Page(self):
        self.do_click(self.gotoConnexionPage_btn)
        return self.is_visible(self.HeaderConnexion)

    def GoToCnx(self):
        self.do_click(self.Cnx)
