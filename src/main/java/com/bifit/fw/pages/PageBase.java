package com.bifit.fw.pages;

import com.bifit.fw.wdfactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public abstract class PageBase {
    WebDriver driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());

}
