package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.BaseClass;
import com.freecrm.objectrepository.OR;

public class CompaniesPage extends BaseClass{

	public CompaniesPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=companiesX)
	public WebElement companeisLink;
	
	@FindBy(xpath=newBtnx)
	public WebElement newBtn;
	
	@FindBy(xpath=companyNameX)
	public WebElement companyNameTxt;
	
	@FindBy(xpath=companyUrlx)
	public WebElement companyUrlTxt;
	
	@FindBy(xpath=companyAddressx)
	public WebElement companyAddresstxt;
	
	@FindBy(xpath=cityx)
	public WebElement cityTxt;
	
	@FindBy(xpath=statex)
	public WebElement stateTxt;
	
	@FindBy(xpath=zipX)
	public WebElement zipTxt;
	
	@FindBy(xpath=boxXpath)
	public WebElement Countrybox;
	
	@FindBy(xpath=countryXpath)
	public WebElement countryDrop;
	
	public void createCompany(String cName,String comUrl,String cAddress,String cCity,String cState,String cZip,String coutry,String value,String tag) {
		try {
			companeisLink.click();
			newBtn.click();
			companyNameTxt.sendKeys(cName);
			companyUrlTxt.sendKeys(comUrl);
			companyAddresstxt.sendKeys(cAddress);
			cityTxt.sendKeys(cCity);
			stateTxt.sendKeys(cState);
			zipTxt.sendKeys(cZip);
			selectDropLooklike(countryDrop, Countrybox, value, tag);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delCompany() {
		
	}
	
}
