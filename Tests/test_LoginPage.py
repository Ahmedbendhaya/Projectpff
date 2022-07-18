import  pytest
from Tests.Test_Base import BaseTest
from Pages.LoginPage import LoginPage
from Config.config import TestData


class Test_Login(BaseTest):
    def test1_signup_link_visible(self):
        self.loginPage.go_to_login_page()
        flag=self.loginPage.is_signup_link_exist()
        assert flag

    def test2_loginPage_title(self):
        title= self.loginPage.get_title(TestData.Login_Page_Title)
        assert title ==TestData.Login_Page_Title

    @pytest.mark.parametrize("Mail, Pass",
     [
     (TestData.Mail_1, TestData.Password_1),
     (TestData.Mail_2, TestData.Password_2),
       (TestData.Mail_3, TestData.Password_3),
     ])
    def test3_login_invalid(self,Mail,Pass):
        assert self.loginPage.do_login_invalid(TestData.Mail_1, TestData.Password_1)

    def test4_Reset_Pass(self):
        assert self.loginPage.Reset_page()

    def test5_Reset_Pass_Valid(self):
        assert self.loginPage.Reset_Pass_Valid_Mail(TestData.Mail)

    def test6_Reset_Pass_Invalid(self):
        assert self.loginPage.Reset_Pass_Invalid_Mail(TestData.Mail_3)

    def test7_Connexion_Page_Return(self):
        assert self.loginPage.Return_To_Connexion_Page()

    def test8_InscriptionPage(self):
        assert self.loginPage.Inscription_Page()

    def test9_login_valid(self):
        self.loginPage.GoToCnx()
        self.loginPage.do_login(TestData.Mail, TestData.Password)
