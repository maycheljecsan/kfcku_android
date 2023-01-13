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

//'Start application on current selected android device'
//Mobile.startExistingApplication('com.kfc.mobile.hkStaging')

WebUI.callTestCase(findTestCase('Login KFCKU Apps/Login Social Media'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.startApplication('C:\\Users\\Ahadian Rifky\\Downloads\\apps.apk', true)

//Mobile.pressBack()

//Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Profil'), 0)
//
//Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.Button - Masuk dengan Google'), 0)
//
//Mobile.pressBack()
//
//Mobile.tap(findTestObject(''), 0)
//
//Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - jecsanmaychelgmail.com'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Beranda'), 0)

Mobile.scrollToText('HARI INI LAPAR? AYO PESAN')

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - DINE-IN'), 0)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Cari Gerai KFC'), 0)

Mobile.setText(findTestObject('Object Repository/Order Dine In/android.widget.EditText - Cari Gerai KFC'), 'MT Haryono', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - MT HARYONO JAKARTA'), 0)

Mobile.closeApplication()

