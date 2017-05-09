package com.bifit.fw.helpers;

import com.bifit.fw.pages.PageSetFilter;
import org.openqa.selenium.support.PageFactory;

public class HelperSetFilter extends HelperBase {

    private PageSetFilter pageSetFilter;

    public HelperSetFilter(){
        pageSetFilter = PageFactory.initElements(manager.getDriver(), PageSetFilter.class);
    }

    //Установка различных фильтров на тестируемой странице
    public void setFiltersAndFindFilm() throws InterruptedException {
        getLogger().info("Начала процеса установки фильтров на странице \"https://afisha.mail.ru/\"");
        try{
            click(pageSetFilter.getButtonInsKino());
            click(pageSetFilter.getButtonSelectorWaitTime());
            click(pageSetFilter.getWaitTime());
            clear(pageSetFilter.getFieldMetroStation());
            click(pageSetFilter.getFieldMetroStation());
            sendKeys(pageSetFilter.getFieldMetroStation(),"Курская");
            click(pageSetFilter.getListStationSearch());
            click(pageSetFilter.getButtonSelectorGenres());
            click(pageSetFilter.getTragedy());
            click(pageSetFilter.getComedy());
            click(pageSetFilter.getFormat2D());
            click(pageSetFilter.getButtonFind());
        }catch (Throwable e){
            getLogger().error(e);
        }
    }

}
