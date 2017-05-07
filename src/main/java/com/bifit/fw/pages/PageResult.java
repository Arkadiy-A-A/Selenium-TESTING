package com.bifit.fw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageResult extends PageBase {

    @FindBy(xpath = "/div[2]/div[4]/div[1]/div[1]/div/div/div/div[2]/div/div/span")
    public WebElement title;

    @FindBy(xpath = "html/body/div[2]/div[4]/div[1]/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[1]/div/div[1]/div")
    public WebElement waitTime;    //когда (число время)

    @FindBy(xpath = "html/body/div[2]/div[4]/div[1]/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[2]/div/div/div[1]/div[1]/div/div/span/span[3]")
    public WebElement metroStation;//на какой станции

    @FindBy(xpath = "html/body/div[2]/div[4]/div[1]/div[2]/div[1]/div/div/div/div/div/form/div[1]/div[3]/div/div[1]/div")
    public WebElement genres;      //кнопка раскрывающая выпадающий список жанров

    @FindBy(xpath = "html/body/div[2]/div[4]/div[1]/div[2]/div[1]/div/div/div/div/div/form/div[2]/div[1]/label")
    public WebElement format2D;    //2d формат


    //Анализ полученного результата
    public boolean equalsResult(){
        return title.getText().equals("Киноафиша Москвы");/*&&
               waitTime.getText().equals("Завтра") &&
               metroStation.getText().equals("Курская") &&
               genres.getText().equals("драммаб комедия") &&
               format2D.isSelected();*/
    }

}
