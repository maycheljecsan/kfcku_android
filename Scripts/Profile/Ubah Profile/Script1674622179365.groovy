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

Mobile.verifyElementVisible(findTestObject('Profile/Header Profile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Profile/Informasi Pribadi/android.widget.TextView - Ubah Profil'), 5)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageView - PP'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - INFO'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - Nama'), 0)

//Mobile.clearText(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.EditText-nama'), 0)
Mobile.tap(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.EditText-nama'), 5)

Mobile.setText(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.EditText-nama'), 'Jecsan', 0)

Mobile.hideKeyboard()

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageButton-nama'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - Email'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageButton-email'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - TL'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageButton - TL'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - JK'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageButton - JK'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView-sos'), 0)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.ImageView-ggle'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView - Google'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.TextView-Ter'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.Button-Simpan'), 0)

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.Button-Simpan'), 0)

Mobile.verifyElementVisible(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.view.ViewGroup-ubh'), 3)

Mobile.tap(findTestObject('Profile/Informasi Pribadi/Ubah Profile/android.widget.Button - Oke'), 0)

Mobile.closeApplication()

