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

Mobile.tap(findTestObject('Login/android.widget.TextView - Profil'), 0)

Mobile.tap(findTestObject('Login/android.widget.EditText - Masukkan nomor handphone Anda'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Masukkan nomor handphone Anda'), '081211287377', 0)

Mobile.tap(findTestObject('Login/android.widget.EditText - Ketik kata sandi Anda'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Ketik kata sandi Anda'), 'pass111', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Login/android.widget.Button - Masuk'), 0)

Mobile.closeApplication()

