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



@Listeners(listeners.TestListener.class)

public class LoginTest extends BaseTest 
{
	//private static final Logger logger = LogManager.getLogger(LoginTest.class);

	@Test
   public  static void Account() {
	   
		//BasicConfigurator.configure();  
		//logger.info("Inside Account method");
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.Account();
        System.out.println("Inside Account Method");
        //logger.info("Exiting Account method");
    }

}
