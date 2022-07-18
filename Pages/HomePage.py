from Pages.BasePage import BasePage
from selenium.webdriver.common.by import By
from Config.config import TestData

class HomePage(BasePage):
    Header_WelcomeName = (By.XPATH, "//h1[contains(@class,'text-capitalize statsTitle mb-3 font-weight-semiboldPlanning')]")
    Dashboard_info = (By.XPATH, "//ul[1][contains(@class,'contact-list list-unstyled')]")
    Courbe = (By.ID, "c3-chart")
    GoToSettingList=(By.ID,"userAccount")
    ListSetting= (By.XPATH,"//span[contains(@class,'dropdown-menu dropdown-menu-right show')]")
    MyProfile=(By.CLASS_NAME,"dropdown-item")
    Deconnexion_Btn=(By.XPATH,"//i[contains(@class,'zmdi zmdi-sign-in zmdi-hc-fw mr-2')]")
    Return_toHome=(By.XPATH,"//span[contains(text(),'Tableau')]")
    Verify_Deconnexion=(By.CLASS_NAME,'slider-text')
    NameView=(By.XPATH,"//button[contains(@id,'mainSidebarCollapse')]")
    GoToSession =(By.XPATH,"//li[3][contains(@class,'nav-item')]/a")

    def __init__(self,driver):
        super().__init__(driver)
        self.driver=driver

    def is_Welcome_name_exist(self):
        if self.is_visible(self.Header_WelcomeName):
           return self.verify_element_text(self.Header_WelcomeName,TestData.Header_Welcome)
    def is_Dashboard_visible(self):
        return self.is_visible(self.Dashboard_info)
    def is_chart_visible(self):
        return self.is_visible(self.Courbe)
    def Open_Setting_List(self):
        self.do_click(self.NameView)
        self.do_click(self.GoToSettingList)
        return self.is_visible(self.ListSetting)
    def Open_My_Profile(self):
        self.do_click(self.MyProfile)
        return self.verify_url(TestData.Url_Profile)

    def GoToSessions(self):
        self.do_click(self.GoToSession)
        return self.verify_url(TestData.URL_Session)
    def Deconnexion(self):
        self.do_click(self.GoToSettingList)
        self.do_click(self.Deconnexion_Btn)
        return self.is_visible(self.Verify_Deconnexion)


