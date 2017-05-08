package com.bifit.fw;

import com.bifit.fw.helpers.HelperResult;
import com.bifit.fw.helpers.HelperSetFilter;
import org.openqa.selenium.WebDriver;

public class ApplicationManager {
    public static ApplicationManager manager = new ApplicationManager();
    private WebDriver driver;
    private HelperSetFilter helperSetFilter;
    private HelperResult helperResult;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public HelperSetFilter getHelperSetFilter() {
        if(helperSetFilter==null){
            helperSetFilter = new HelperSetFilter();
        }
        return helperSetFilter;
    }

    public HelperResult getHelperResult() {
        if(helperResult==null){
            helperResult = new HelperResult();
        }
        return helperResult;
    }
}
