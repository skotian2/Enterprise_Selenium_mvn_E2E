package Test;
import org.testng.annotations.Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import Pages.LoginPage;
import listeners.TestListener;
import Base.LoggingMain;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;



@Listeners(listeners.TestListener.class)

public class LoginTest extends BaseTest 
{
	private static final Logger logger = LogManager.getLogger(LoginTest.class);
	@Test (groups = { "PROD" })
	//@Test(priority=2)
  	public  static void Account() {
	   
		BasicConfigurator.configure();  
		logger.info("Inside logger Account method");
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.Account();
        logger.info("Exiting Account method");
    }
    
	@Test (groups = { "PROD" })
  	public  static void AccountSearch() {
		logger.info("Inside AccountSearch method");
		LoginPage loginPage = new LoginPage(getWebDriver());
		loginPage.Search();
		logger.info("Exiting AccountSearch method");
    }

	@Test(priority=2)
  	public  static void AccountVerify() {
		logger.info("Inside Account Verify Method");
    }
	

	@Test(priority=3)
  	public  static void AccountClick() {
		logger.info("Inside AccountClick Method");
		LoginPage loginPage = new LoginPage(getWebDriver());
		loginPage.AccountClick();
		logger.info("Exit Account Click method");
		
    }
	
	
	
}
