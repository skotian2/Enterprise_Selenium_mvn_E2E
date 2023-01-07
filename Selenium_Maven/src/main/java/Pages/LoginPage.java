package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {

    /* APP Base URL */
    final static String loginUrl = "https://www.amazon.com/";

    /* Element Locators */
    By Account = By.xpath("//*[@id=\"nav-search-submit-button\"]"); 
    By Search  = By.xpath("//*[@id='twotabsearchtextbox']");
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
        webDriver.get(loginUrl);
        return new LoginPage(webDriver);
    }


    
    
    public void Account() {
    	Actions At= new Actions(webDriver);
    	At.clickAndHold(webDriver.findElement(Account)).build().perform();
    	System.out.println(Account);
        
    }
  
    
    public void Search() {
    	webDriver.findElement(Search).sendKeys("keychain");      
    }
}
