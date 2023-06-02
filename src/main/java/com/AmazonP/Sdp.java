package com.AmazonP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp {
	public WebDriver driver=null;
	
	public HomePom getHomePom() {
		HomePom H=new HomePom(driver);
		return H;
		

	}
	public SearchPage getSearchPage() {
		SearchPage P=new SearchPage(driver);
		return P;

	}
	
	public Sdp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
			
	

}
