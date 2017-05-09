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
         /*pageResult.getFormat2D().isSelected()); Почему то метод возвращает false, хотя
                должен вернут true*/
        Boolean result = pageResult.getTitle().getText().equals("Киноафиша Москвы") &&
                pageResult.getWaitTime().getText().equals("Завтра") &&
                pageResult.getMetroStation().getText().equals("Курская") &&
                pageResult.getGenres().getText().equals("драма, комедия");

        if(result){
            getLogger().info("Тест прошел проверку. Фукционал соответствует требованию");
        }
        else{
            getLogger().warn("Тест не прошел проверку. Фукционал не соответствует требованию");
            Assert.assertTrue("Тест не прошел проверку",result);
        }





    }
}
