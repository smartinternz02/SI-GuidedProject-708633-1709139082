import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyOptionPresentByLabel(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center     Hongkong CURA Healthcare Center  Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', false, 0)

WebUI.selectOptionByValue(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center     Hongkong CURA Healthcare Center  Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyElementNotChecked(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'), 
    0)

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.verifyElementChecked(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospital_readmission'), 
    0)

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/label_Medicare'))

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/td_17'))

WebUI.setText(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Make Appointment TC_002')

WebUI.click(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Cura_MakeAppointment_OR/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    0)

WebUI.verifyTextPresent('Please be informed that your appointment has been booked as following:', false)

WebUI.closeBrowser()

