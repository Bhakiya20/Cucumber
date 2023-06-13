package Amazon.Stefdef;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.AmazonP.Sdp;

import Amazon.Runner.RunnerClass;
import amazon.Base.Base_A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StefdefClass extends Base_A {
	public static WebDriver driver = RunnerClass.driver ;
	Sdp s=new Sdp(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	  driver.get("https://www.amazon.in/");
	//launchingUrl("https://www.amazon.in/");
	}

	@When("^user Selects Baby Category From Dropdown$")
	public void user_Selects_Baby_Category_From_Dropdown() throws Throwable {
		//WebElement all=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		WebElement all = s.getHomePom().getAll();
		dropDown(all, "Baby");
	
		
		//Select s= new Select(all);
		//s.selectByVisibleText("Baby");
	}

	@When("^user Enters Toys In The Search Field$")
	public void user_Enters_Toys_In_The_Search_Field() throws Throwable {
//		WebElement kids = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement kids = s.getSearchPage().getKids();
//		kids.sendKeys("toys");
		userInput(kids, "toys");
		
	 }

	@Then("^user Clicks And It Navigates To Next Page$")
	public void user_Clicks_And_It_Navigates_To_Next_Page() throws Throwable {
		Thread.sleep(3000);
//		WebElement option = driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[4]"));
//	    option.click();
		WebElement option = s.getSearchPage().getOption();
		clickOnElement(option);
		
	}

	@When("^user Get The Title Of The Product$")
	public void user_Get_The_Title_Of_The_Product() throws Throwable {
//		List <WebElement> title=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		List<WebElement> title = s.getSearchPage().getTitle();
		int size = title.size();
		System.out.println(size);
	}

	



}
