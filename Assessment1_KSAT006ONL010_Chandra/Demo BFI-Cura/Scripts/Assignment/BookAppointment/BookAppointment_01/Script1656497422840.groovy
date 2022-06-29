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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/input_Username_username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/input_Password_password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/button_Login'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/th_June 2022'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/th_2022'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/th_'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/span_2009'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/span_Feb'))

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/td_3'))

WebUI.setText(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/textarea_Comment_comment'), 
    'test invalid date')

WebUI.click(findTestObject('Object Repository/Assignment/BookAppointment/BookAppointment_01/button_Book Appointment'))

