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
Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Profile/android.widget.TextView - Profil'), 5)

Mobile.tap(findTestObject('Profile/android.widget.TextView - Profil'), 5)

Mobile.verifyElementVisible(findTestObject('Profile/Header Profile/android.widget.ImageView'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Header Profile/android.widget.TextView - 081211287377'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Header Profile/android.widget.TextView - MIKE'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Header Profile/android.widget.TextView - Terdaftar sejak'), 0)

Mobile.scrollToText('Version', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/android.widget.ImageView'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/android.widget.TextView - INFORMASI PRIBADI'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/android.widget.TextView - Ubah Profil'), 0)

