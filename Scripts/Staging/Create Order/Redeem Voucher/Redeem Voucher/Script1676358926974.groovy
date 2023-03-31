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

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.widget.TextView - Voucher'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Voucher/android.view.ViewGroup-2'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.view.ViewGroup-2'), 0)

//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementText(findTestObject('Voucher/android.widget.TextView - head DETIL VOUCHER'), 'DETIL VOUCHER')
//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//WebUI.waitForImagePresent(findTestObject('Voucher/android.widget.ImageView-imagevoucher'), 3)
Mobile.swipe(281, 500, 434, 161)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.widget.Button - Mulai Order'), 0)

Mobile.verifyElementVisible(findTestObject('Voucher/android.view.View-ordertype voucher'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.LinearLayout-type1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Cari Gerai KFC'), 5)

Mobile.setText(findTestObject('Object Repository/Order Dine In/android.widget.EditText - Cari Gerai KFC'), 'MT Haryono', 
    10)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/Order Dine In/android.widget.TextView - MT HARYONO JAKARTA'), 
    5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - Pilih Gerai'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.widget.Button - Tambah2'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.Button-tambah item'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.Button - Lanjut'), 3)

Mobile.tap(findTestObject('Voucher/android.widget.LinearLayout-checkout'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.widget.TextView - Pilih Menu Gratis'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.verifyElementVisible(findTestObject('Voucher/android.widget.LinearLayout-pilih voucher'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.LinearLayout-pilih voucher'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.ImageView-imagevoucher'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Voucher/android.widget.Button - Gunakan Voucher'), 0)

Mobile.tap(findTestObject('Voucher/android.widget.ImageView-back button'), 0)

//Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

