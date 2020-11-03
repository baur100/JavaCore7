package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pageObjects.BasePage;
import pageObjects.MainPage;

public class Listeners implements ITestListener {
    private static Logger logger= LogManager.getLogger(BasePage.class);
    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info("Test = " + iTestResult.getName() + " started");
        System.out.println("Test = " + iTestResult.getName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Success "+iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        logger.fatal("Test  "+ iTestResult.getName()+ " FAILED - Call 911");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
