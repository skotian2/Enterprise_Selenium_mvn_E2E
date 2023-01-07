package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

import java.io.File;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;

//import listeners.TestListener;

public class Screenshot {
	private static final Logger logger = LogManager.getLogger(Screenshot.class);
    public static void takeSnapShot(WebDriver webdriver, String path) {
    	logger.info("Inside Screenshot Method");
 	    TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(path + ".png");
        try {
            FileUtils.copyFile(SrcFile, DestFile);
            logger.info("Exiting ScreenShot Method");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}