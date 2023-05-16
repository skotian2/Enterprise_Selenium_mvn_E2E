package Test;
import org.testng.annotations.Test;
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
	//@Test (groups = { "PROD" })
	
	@Test(priority=0)
  	public  static void Account() {
	   
		BasicConfigurator.configure();  
		logger.info("Inside logger Account method");
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.Account();
        loginPage.Search();
        logger.info("Exiting Account method");
    }
    

	@Test(priority=1)
  	public  static void AccountVerify()
	{
		logger.info("Inside Account Verify Method");
		
    }
}
