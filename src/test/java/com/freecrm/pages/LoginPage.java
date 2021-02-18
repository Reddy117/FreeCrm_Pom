package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.BaseClass;
import com.freecrm.objectrepository.OR;

public class LoginPage extends BaseClass{

	
	
	@FindBy(xpath=OR.uNamex)
	public WebElement uNameTxt;
	
	@FindBy(xpath=OR.passWordx)
	public WebElement passWordTxt;
	
	@FindBy(xpath=OR.loginBtnx)
	public WebElement loginBtn;
	
	public void doLogin() {
		try {
			System.out.println(p.getProperty("uName"));
			uNameTxt.sendKeys(p.getProperty("uName"));
			passWordTxt.sendKeys(p.getProperty("passWord"));
			loginBtn.click();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
}
