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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://hc.staging.medigo.id/login')

WebUI.setText(findTestObject('Object Repository/Page_Masuk/Input Username'), "admintest007")

WebUI.setText(findTestObject('Object Repository/Page_Masuk/Input Password'), "admintest007")

WebUI.click(findTestObject('Object Repository/Page_Masuk/button_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Masuk/Decline Notification Permission Button'), 30)

WebUI.click(findTestObject('Object Repository/Page_Masuk/Decline Notification Permission Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/Medigo Logo'), 30)

WebUI.click(findTestObject('Object Repository/Page_Dashboard/Dokter Button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dokter/Input Search Dokter') ,30)

WebUI.click(findTestObject('Object Repository/Page_Dokter/Add Dokter Button'))

def NamaDokter='Syailendra'

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Nama Dokter'), NamaDokter)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Tanggal Lahir Dokter'), '06/10/1997')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Identity Card Number'), '1234567890123456')

WebUI.click(findTestObject('Object Repository/Page_Tambah Dokter/Gender Selection'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Dokter/Male'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Consultation Duration'), '30')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Phone Number'), '+6281222334455')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Email'), 'Syailendra@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Spesialization'), 'Spesialis Penyakit Dalam')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Dokter/Input Poliklinik'), 'Akupuntur')

WebUI.click(findTestObject('Object Repository/Page_Tambah Dokter/div_Simpan'))

WebUI.setText(findTestObject('Object Repository/Page_Dokter/Input Search Dokter'), NamaDokter)

WebUI.delay(3)

def compare_name=WebUI.getText(findTestObject('Object Repository/Page_Dokter/Nama Dokter 1')).toString()

def UpperCaseName = NamaDokter.toUpperCase()

if(compare_name.contains(NamaDokter) == true){
	KeywordUtil.markPassed('Search Success')
}else if(compare_name.contains(UpperCaseName) == true){
	KeywordUtil.markPassed('Search Success')
}else{
	KeywordUtil.markFailedAndStop('Search Failed')
}

