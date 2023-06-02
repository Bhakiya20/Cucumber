package com.AmazonP;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;
	//private void kids() {
	@FindBy(xpath = "//input[@type='text']")
	private WebElement kids;
	public WebElement getKids() {
		return kids;
	}
	
	@FindBy(xpath = "(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[4]")
	private WebElement option;
	public WebElement getOption() {
		return option;
	}
	@FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
	private List<WebElement> title;
	public List<WebElement> getTitle() {
		return title;
	}
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
		
	}


