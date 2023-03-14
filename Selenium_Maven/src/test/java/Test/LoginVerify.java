package Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import Pages.LoginPage;
import listeners.TestListener;
import Base.LoggingMain;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;



//@Listeners(listeners.TestListener.class)

public class LoginVerify //extends BaseTest 
{
	private static final Logger logger = LogManager.getLogger(LoginVerify.class);

	@Test(priority=1)
	@Parameters("browser")
  	public  static void LoginVerifyAccount() {
	   
		//BasicConfigurator.configure();  
		logger.info("Inside LoginVerify logger Account method");
        logger.info("Exiting LoginVerify Account method");
    }

	@Test(priority=2)
  	public  static void LoginVerifyAccountSearch() {
		logger.info("Inside LoginVerify AccountSearch method");
		logger.info("Exiting  LoginVerifyAccountSearch method");
    }

	@Test(priority=3)
  	public  static void LoginVerifyAccountVerify() {
		logger.info("Inside  LoginVerify Account Verify Method");
    }
	

	@Test(priority=4)
  	public  static void LoginVerifyAccountClick() {
		logger.info("Inside  LoginVerify AccountClick Method");
    	logger.info("Exit LoginVerify Account Click method");
    }
}
