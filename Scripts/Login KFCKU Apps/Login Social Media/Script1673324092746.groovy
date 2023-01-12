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

'Start application on current selected android device'
Mobile.startApplication('C:\\Users\\Ahadian Rifky\\Downloads\\KFC-3064_app-hkStaging-debug.apk', true)

Mobile.tap(findTestObject('Login/android.widget.Button - Izinkan'), 0)

Mobile.tap(findTestObject('Login/android.widget.Button - Izinkan'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView - Lewati'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Login/android.widget.TextView - Profil'), 0)

Mobile.tap(findTestObject('Login Social Media/android.widget.Button - Masuk dengan Google'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login Social Media/android.widget.TextView - jecsanmaychelgmail.com'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()


//Mobile.closeApplication()

