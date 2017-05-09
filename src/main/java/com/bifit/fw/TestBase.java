package com.bifit.fw;

import org.openqa.selenium.remote.DesiredCapabilities;
import com.bifit.fw.wdfactory.WebDriverFactory;
import org.apache.log4j.Logger;
import org.junit.Before;

import java.util.concurrent.TimeUnit;


public class TestBase {
    protected ApplicationManager manager = ApplicationManager.manager;
    private static final Logger logger = Logger.getLogger(TestBase.class);

    public static Logger getLogger() {
        return logger;
    }

    @Before
    public void setUp() throws Exception {
        manager.setDriver(WebDriverFactory.getDriver(DesiredCapabilities.firefox()));
        manager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
