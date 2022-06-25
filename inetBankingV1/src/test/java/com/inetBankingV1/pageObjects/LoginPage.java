package com.inetBankingV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver Idriver;
	
	//create constructor
	LoginPage(WebDriver rdriver){
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
}
