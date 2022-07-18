import pytest
from selenium import webdriver
from Config.config import TestData
from Pages.BasePage import BasePage
from Pages.LoginPage import LoginPage
from Pages.HomePage import HomePage
import allure
from allure_commons.types import AttachmentType
driver =None
@allure.severity(allure.severity_level.MINOR)
@pytest.fixture(params=["chrome","edge"],scope='class')
def init_driver(request):
    global driver
    if request.param=="chrome":
        driver=webdriver.Chrome(executable_path=TestData.Chrome_Executable_Path)

    if request.param == "edge":
        driver = webdriver.Edge(executable_path=TestData.edge_Executable_Path)
    #request.cls.basepage=BasePage(driver)
    request.cls.loginPage = LoginPage(driver)
    request.cls.homePage = HomePage(driver)
    request.cls.driver =driver
    driver.maximize_window()
    driver.get(TestData.Base_URL)
    yield driver
    driver.close()