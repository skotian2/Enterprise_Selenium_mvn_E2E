package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;


public class LoginPage extends BasePage {
	private static final Logger logger = LogManager.getLogger(LoginPage.class);
    
    /* APP Base URL */
    final static String loginUrl = "https://www.amazon.com/";
    
    /* Element Locators */
    By Account = By.xpath("//*[@id=\"nav-search-submit-button\"]"); 
    By Search  = By.xpath("//*[@id='twotabsearchtextbox']");
    By AccountClick = By.xpath("//*[@id='nav-link-accountList']");
    		
    /**
     * Login Page constructor
     *
     * @param webDriver
     */
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * Navigates to Login Page
     *
     * @return LoginPage
     */
    
    public LoginPage goTo() {
    
    	logger.info("Inside login page method");
    	webDriver.get(loginUrl);
        return new LoginPage(webDriver);
    }


    
    
    public void Account() {
    	logger.info("Inside Account method");
    	Actions At= new Actions(webDriver);
    	At.clickAndHold(webDriver.findElement(Account)).build().perform();
    	System.out.println(Account);
        
    }
  
    
    public void Search() {
    	logger.info("Inside search page method");
    	webDriver.findElement(Search).sendKeys("keychain");      
    }
    
    public void AccountClick() {
    	logger.info("Inside search page method");
    	webDriver.findElement(AccountClick).click();     
    }
}
