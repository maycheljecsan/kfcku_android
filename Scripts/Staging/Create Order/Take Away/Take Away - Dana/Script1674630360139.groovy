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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//'Start application on current selected android device'
Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Staging/Login KFCKU Apps/Login Social Media'), [:], FailureHandling.STOP_ON_FAILURE)
Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Beranda'), 5)

Mobile.swipe(281, 500, 434, 161)

Mobile.tap(findTestObject('Order Type/android.widget.TextView - TAKE AWAY'), 5)

Mobile.tap(findTestObject('Object Repository/Order Dine In/android.widget.TextView - Cari Gerai KFC'), 5)

Mobile.setText(findTestObject('Object Repository/Order Dine In/android.widget.EditText - Cari Gerai KFC'), 'MT Haryono', 
    5)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/Order Dine In/android.widget.TextView - MT HARYONO JAKARTA'), 
    5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.Button - Pilih Gerai'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/android.widget.FrameLayout'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Order Dine In/android.widget.Button - Add'), 5)

Mobile.tap(findTestObject('Order Dine In/android.widget.Button - Add'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Button Lanjut Order Menu'), 5)

//Mobile.scrollToText('Continue', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('Order Dine In/Button Lanjut Order Menu'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.LinearLayout'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.TextView - Pilih Menu Gratis'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.waitForElementPresent(findTestObject('Order HMD/rev-HMD/android.widget.Button - Pilih Sekarang'), 10)

Mobile.tap(findTestObject('Order HMD/rev-HMD/android.widget.Button - Pilih Sekarang'), 10)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Tambah'), 10)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Tambah'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Lanjutkan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/android.widget.LinearLayout-paymethod'), 5)

//Mobile.swipe(281, 500, 434, 161)
//Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.TextView - Kartu Debit'), 5)
//Mobile.tap(findTestObject('Order Dine In/Payment/imgPayment/android.widget.ImageView (1)'), 5)
//TestObject testObjectOne = new TestObject()
//
//testObjectOne.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[4]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]')
//
//Mobile.tap(testObjectOne, 5)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.swipe(281, 500, 434, 161)
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//TestObject testObjectTwo = new TestObject()
//
//testObjectTwo.addProperty('xpath', ConditionType.EQUALS, '//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView[1]/android.widget.LinearLayout[7]/android.view.ViewGroup[1]/android.widget.ImageView[1]')
//
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//
//Mobile.tap(testObjectTwo, 5)
//Mobile.scrollToText('Simpan')
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(281, 500, 434, 161)
Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.view.ViewGroup - dana'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Simpan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(281, 500, 434, 161)
Mobile.tap(findTestObject('Order Dine In/Order/Revamp/android.widget.Button - Pesan Sekarang'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

//Mobile.waitForElementPresent(findTestObject('Order Dine In/Payment/imgPayment/android.view.View'), 5)
//
//Mobile.tap(findTestObject('Order Dine In/Payment/android.view.View'), 10)
//
//Mobile.waitForElementPresent(findTestObject('Order Dine In/Payment/android.widget.TextView - Konfirmasi pembayaran Anda'), 
//    10)
//
//Mobile.tap(findTestObject('Order Dine In/Payment/android.widget.ImageButton'), 10)
//Mobile.waitForElementPresent(findTestObject('Order Dine In/Order/android.widget.TextView - OKE'), 5)
//TestObject popup = new TestObject().addProperty('xpath', ConditionType.EQUALS, "Order Dine In/Order/android.widget.TextView - OKE]")
//if (Mobile.verifyElementExist(popup, 5))
//	Mobile.tap(popup, 0)
//	
//Mobile.tap(findTestObject('Order Dine In/Order/android.widget.TextView - OKE'), 10)
//TestObject scroll = new TestObject().addProperty('xpath', ConditionType.EQUALS, "")
//if (Mobile.verifyElementExist(scroll, 5))
//	Mobile.scrollToText('TOTAL')
//Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)
Mobile.closeApplication()

