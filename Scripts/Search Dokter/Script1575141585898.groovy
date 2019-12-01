import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
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

def name = "bdi"

WebUI.setText(findTestObject('Object Repository/Page_Dokter/Input Search Dokter'), name)

WebUI.delay(3)

def compare_name=WebUI.getText(findTestObject('Object Repository/Page_Dokter/Nama Dokter 1')).toString()

def UpperCaseName = name.toUpperCase()

if(compare_name.contains(name) == true){
	KeywordUtil.markPassed('Search Success')
}else if(compare_name.contains(UpperCaseName) == true){
	KeywordUtil.markPassed('Search Success')
}else{
	KeywordUtil.markFailedAndStop('Search Failed')
}

