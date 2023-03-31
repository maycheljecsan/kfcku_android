import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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
Mobile.startExistingApplication('com.kfc.mobile', FailureHandling.STOP_ON_FAILURE)

//Mobile.startExistingApplication(GlobalVariable.appPackage, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(5)

Mobile.pressBack()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Production/Home - Login/Beranda'), 5)

//Mobile.tap(findTestObject('Login/android.widget.Button - Izinkan'), 0)
//
//Mobile.tap(findTestObject('Login/android.widget.Button - Izinkan'), 0)
//
//Mobile.tap(findTestObject('Login/android.widget.TextView - Lewati'), 0)
//
//Mobile.delay(3)
Mobile.tap(findTestObject('Production/Home - Login/Profil'), 0)

Mobile.tap(findTestObject('Production/Home - Login/Button - Masuk dengan Google'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Production/Home - Login/jecsanmaychelgmail.com'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Production/Home - Login/Profil'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(281, 500, 434, 161)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Production/Setting - Keluar Apps/Keluar'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Production/Setting - Keluar Apps/Ya'), 5)

Mobile.closeApplication()

