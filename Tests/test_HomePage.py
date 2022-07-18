import pytest
from Tests.Test_Base import BaseTest
from Pages.HomePage import HomePage
from Config.config import TestData
from Pages.LoginPage import LoginPage


class Test_Homepage(BaseTest):
    def test1_home_page_welcome(self):
        self.loginPage.do_login(TestData.Mail,TestData.Password)
        assert self.homePage.is_Welcome_name_exist()
    def test2_dashboard(self):
        assert self.homePage.is_Dashboard_visible()
    def test3_chart(self):
        assert self.homePage.is_chart_visible()
    def test4_SettingList(self):
        assert self.homePage.Open_Setting_List()
    def test5_Profile(self):
        assert self.homePage.Open_My_Profile()
    def test6_Session(self):
        assert self.homePage.GoToSessions()
    def test7_Deconnexion(self):
        assert self.homePage.Deconnexion()


