from selenium.webdriver import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium import webdriver


"""This class is parent of all pages"""
#This class is the base class
class BasePage:

    #Initialization fuction
    def __init__(self,driver):
        self.driver= driver

    #Click on the element
    def do_click(self,by_locator):
        WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator)).click()
    # Send data to a text box
    def do_send_keys(self,by_locator,text):
        WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator)).send_keys(text)
    #Getting the text of an element
    def get_element_text(self,by_locator):
        element= WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator))
        return element.text
    #Verify is the element is visible or not
    def is_visible(self,by_locator):
        element= WebDriverWait(self.driver,10).until(EC.visibility_of_element_located(by_locator))
        return bool(element)
    #Getting the title of the page
    def get_title(self,title):
        WebDriverWait(self.driver,10).until(EC.title_is(title))
        return self.driver.title
    #Verification of the URL
    def verify_url(self,text):
        element= WebDriverWait(self.driver,10).until(EC.url_contains(text))
        return bool(element)
    # Verification of the element text
    def verify_element_text(self,by_locator,text):
       element=WebDriverWait(self.driver,10).until(EC.text_to_be_present_in_element(by_locator,text))
       return  bool(element)

