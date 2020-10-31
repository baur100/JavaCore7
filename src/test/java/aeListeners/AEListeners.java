package aeListeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import pageObjects.BasePage;

public class AEListeners implements ITestListener {
    private static Logger logger = (Logger) LogManager.getLogger(BasePage.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {
        logger.info("Test= " + iTestResult.getName() + " started");
        System.out.println("Test= " + iTestResult.getName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Succes " + iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

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
