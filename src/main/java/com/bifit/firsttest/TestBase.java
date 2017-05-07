package com.bifit.firsttest;

import com.bifit.fw.pages.PageSetFilter;
import com.bifit.fw.wdfactory.WebDriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp() throws Exception {
        driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
        baseUrl = "";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    //Переход на страницу afisha.mail.ru
    public PageSetFilter goToMainPage() {
        driver.get(baseUrl + "https://afisha.mail.ru/");
        return PageFactory.initElements(driver, PageSetFilter.class);
    }

}
