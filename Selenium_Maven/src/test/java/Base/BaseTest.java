package Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;

import Test.LoginTest;

public class BaseTest {

    protected static WebDriver webDriver;
    final static String baseUrl = "https://www.amazon.com/";
    private static final Logger logger = LogManager.getLogger(BaseTest.class); 
    public WebDriver getDriver() {
        return webDriver;
    }

    @BeforeClass
    public void setUp() {
    	logger.info("Inside setup method - Setting up chromedriver");
        System.setProperty("webdriver.chrome.driver","C:\\Sandeep_Work\\QAAutomation\\Enterprise_Selenium_mvn_E2E\\Selenium_Maven\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        webDriver = new ChromeDriver(options);
        webDriver.get(baseUrl);
        logger.info("Launching base url"+baseUrl);
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();
        System.out.println("Exiting browser method");
        logger.info("Closing Browser ...........");
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

}
