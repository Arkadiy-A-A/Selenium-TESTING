package com.bifit.fw.helpers;

import com.bifit.fw.pages.PageResult;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;


public class HelperResult extends HelperBase {
    private PageResult pageResult;

    public HelperResult(){
        pageResult = PageFactory.initElements(manager.getDriver(), PageResult.class);
    }



    //Анализ полученного результата
    public void equalsResult(){
        //System.out.println(pageResult.getFormat2D().isSelected());
        Assert.assertTrue("Тест не прошел проверку",pageResult.getTitle().getText().equals("Киноафиша Москвы") &&
                pageResult.getWaitTime().getText().equals("Завтра") &&
                pageResult.getMetroStation().getText().equals("Курская") &&
                pageResult.getGenres().getText().equals("драма, комедия"));

    }
}
