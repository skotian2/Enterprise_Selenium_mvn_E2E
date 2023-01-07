package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends BasePage {

    /* APP Base URL */
    final static String loginUrl = "https://www.amazon.com/";

    /* Element Locators */
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    //By loginButton = By.xpath("//button[contains(.,\"Login\")]");
    By loginButton = By.xpath("//button[contains(.,\"Demo\")]");
    //By Account = By.xpath("//*[@id=\"nav-link-accountList\"]"); 
    By Account = By.xpath("//*[@id=\"link-accountList\"]"); 
    
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

    /**
     * Set userName and Password fields then clicks on the login button
     *
     * @param userName
     * @param password
     */
    
    public void login(String userName, String password) {
        webDriver.findElement(userNameField).sendKeys(userName);
        webDriver.findElement(passwordField).sendKeys(password);
        webDriver.findElement(loginButton).click();
    }
    
    public void Account() {
    	Actions At= new Actions(webDriver);
    	At.clickAndHold(webDriver.findElement(Account)).build().perform();
        
    }
    
}
