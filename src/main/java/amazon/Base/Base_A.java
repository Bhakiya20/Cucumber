package amazon.Base;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//1
public class Base_A {
	public static WebDriver driver=null;
	public static WebDriver browserLaunch(String value) {
		//WebDriverManager.chromedriver().setup();
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Braver Robotics\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");
			//driver = new ChromeDriver();
			//driver.manage().window().maximize();

		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhakiyalakshmi\\Desktop\\Eclipse\\2019-12\\Amazon\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.driver.gecko","path");
			driver=new FirefoxDriver();
		}else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.driver.edge", "path");
			driver=new EdgeDriver();
			
		}		
		
		driver.manage().window().maximize();
		return driver;	
	}
	//2
	public static void launchingUrl(String value) {
		driver.get(value);
	}
	//3
	public void userInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	//4
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	//5
	public static void navigate() {
		driver.navigate().forward();
	}
	//6
	public static void navigetb() {
		driver.navigate().back();
	}
	//7
	public static void refresh() {
		driver.navigate().refresh();
	}
	//8
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}//9
	public static void getCurrentUrl() {
		String s= driver.getCurrentUrl();
		System.out.println(s);
	}
	//10
	public static void gettitle() {
		String T=driver.getTitle();
		System.out.println(T);
	}
	//11
	public static String getText(WebElement element) {
		String xtext=element.getText();
		return xtext;
	}
	//12
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	//13
	public static boolean isDisplayed(WebElement element) {
		boolean display=element.isDisplayed();
		return display;
	}
	//14
	public static boolean isSelected(WebElement element) {
		boolean select=element.isSelected();
		return select;	
	}
	//15
	public static void clickOnElementjs(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click;", element);
	}
	//16
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview", element);
	}
	//17
	public static void scrollBy() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,range);");
	}
	//18
	public static void takeScreenshot(String name) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Bhakiyalakshmi\\Desktop\\Eclipse\\2019-12\\Amazon\\screenshot"+name+".png");
	}
	//simple alert
	//confirm alert
	//prompt alert--sendkeys
	//19
	public static void popUp(String options) {
		if (options.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
			
		}
		else if (options.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
			
		}
		else if (options.equalsIgnoreCase("prompt")) {
			driver.switchTo().alert().sendKeys("123");
		}
		}
	//select by value
	//select by index
	//select by visible text
	//deselect by value
	//deselect by index
	//deselect by visible text
	//isMultiple
	//getFirstSelected
	//getAllSelected
	
	//20
	public static void dropDown(WebElement element, String options) {
		Select down=new Select(element);
		down.selectByVisibleText(options);
	}
}
	
