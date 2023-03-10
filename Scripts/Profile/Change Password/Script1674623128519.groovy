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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Profile/android.widget.TextView - Profil'), 5)

Mobile.tap(findTestObject('Profile/android.widget.TextView - Profil'), 5)

Mobile.tap(findTestObject('Profile/Informasi Pribadi/android.widget.TextView - Ubah Kata Sandi'), 0)

Mobile.waitForElementPresent(findTestObject('Profile/android.widget.TextView - Profil'), 5)

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-pass'), 5)

Mobile.setText(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-pass'), 'pass123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-nu'), 5)

Mobile.setText(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-nu'), 'pass123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-conf'), 5)

Mobile.setText(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.EditText-conf'), 'pass123', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Change Password/android.widget.Button-save'), 5)

Mobile.comment(null)

