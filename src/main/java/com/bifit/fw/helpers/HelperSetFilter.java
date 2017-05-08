package com.bifit.fw.helpers;


import com.bifit.fw.TestBase;
import com.bifit.fw.pages.PageSetFilter;
import org.openqa.selenium.support.PageFactory;

public class HelperSetFilter extends TestBase {

    private PageSetFilter pageSetFilter;

    public HelperSetFilter(){
        pageSetFilter = PageFactory.initElements(manager.getDriver(), PageSetFilter.class);
    }

    //Установка различных фильтров на тестируемой странице
    public void setFiltersAndFindFilm() throws InterruptedException {
        pageSetFilter.getButtonInsKino().click();
        pageSetFilter.getButtonSelectorWaitTime().click();
        pageSetFilter.getWaitTime().click();
        pageSetFilter.getFieldMetroStation().clear();
        pageSetFilter.getFieldMetroStation().click();
        pageSetFilter.getFieldMetroStation().sendKeys("Курская");
        Thread.sleep(1000);
        pageSetFilter.getListStationSearch().click();
        pageSetFilter.getButtonSelectorGenres().click();
        pageSetFilter.getTragedy().click();
        pageSetFilter.getComedy().click();
        pageSetFilter.getFormat2D().click();
        pageSetFilter.getButtonFind().click();
        Thread.sleep(10000);
    }

}
