package com.bifit.fw;

import com.bifit.fw.ApplicationManager;
import com.bifit.fw.pages.PageSetFilter;
import com.bifit.fw.wdfactory.WebDriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected ApplicationManager manager = ApplicationManager.manager;

    @Before
    public void setUp() throws Exception {
        manager.setDriver(WebDriverFactory.getDriver(DesiredCapabilities.firefox()));
    }
}
