package com.test.moneylion.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.Helper.ActionHelper;
import com.framework.Helper.WaitHelper;
import com.framework.base.LocalBrowserInitialzation;

public class LandingPage {

	public LandingPage(WebDriver driver) {
		LocalBrowserInitialzation.driver = driver;
		PageFactory.initElements(LocalBrowserInitialzation.driver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "About Us")
	WebElement aboutUsMenu;

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'About Us') and @class='menu-link-blank']//following-sibling::div//a")
	List<WebElement> aboutUsDropDownList;
	
	@FindBy(how = How.LINK_TEXT, using = "Careers")
	WebElement Careers;

	public LandingPage hoverOnAboutUsMenu() {

		WaitHelper.isvisible(aboutUsMenu, LocalBrowserInitialzation.driver);
		ActionHelper.mouseHover(LocalBrowserInitialzation.driver, aboutUsMenu);
		return new LandingPage(LocalBrowserInitialzation.driver);
	}

	public LandingPage clickOnAboutUsDropDownValues(String value) {

	for(WebElement aboutUsDropDown : aboutUsDropDownList) {
	     if(aboutUsDropDown.getText().equals(value)) {
	    	 ActionHelper.clickonElement(aboutUsDropDown, LocalBrowserInitialzation.driver);
	    	 break; 	 
	    	  
	     }}
		return new LandingPage(LocalBrowserInitialzation.driver);

	}
}
