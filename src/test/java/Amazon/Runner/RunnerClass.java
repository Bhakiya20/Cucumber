package Amazon.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.Base.Base_A;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Bhakiyalakshmi\\Desktop\\Eclipse\\2019-12\\Amazon\\src\\test\\java\\Amazon\\Feature\\amazon.feature",
                 glue="Amazon.Stefdef",
                 plugin={"pretty","html:Report/htmlReport.html",
                 		"json:Report/jsonReport.json",
                 		"junit:Report/junitReport.xml",
                 		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
                 		})
public class RunnerClass extends Base_A {
	public static WebDriver driver=null;
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		
		//driver=browserLaunch("chrome");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhakiyalakshmi\\Desktop\\Eclipse\\2019-12\\Amazon\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void close() {
		driver.close();
		
	}
	
	

}
