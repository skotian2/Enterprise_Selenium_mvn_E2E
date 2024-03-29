package listeners;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Utils.Screenshot;

public class TestListener extends BaseTest implements ITestListener {
	    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	
        
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClassFailure = result.getInstance();
        WebDriver driver = ((BaseTest) testClassFailure).getDriver();
        if (driver instanceof WebDriver) {
            String testName = getTestMethodName(result).split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toString();
            System.out.println("Screenshot captured for test case:" + testName);
            Screenshot.takeSnapShot(driver, "screenshots/Pass/" + getTestMethodName(result));
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
