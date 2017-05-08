package com.bifit.fw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageResult extends PageBase {

    @FindBy(xpath = "//span/h1")
    private WebElement title;

    @FindBy(xpath = "//div[@class ='dropdown__text js-dates__title']")
    private WebElement waitTime;    //когда (число время)

    @FindBy(xpath = "//div[@class = 'tag tag_close js-suggest__entered-item margin_left_10']//span[3]")
    private WebElement metroStation;//на какой станции

    @FindBy(xpath = "//div[@class = 'dropdown__text js-multiselect__title']")
    private WebElement genres;      //кнопка раскрывающая выпадающий список жанров

    @FindBy(xpath = "//form/div[2]/div[1]/label")
    private WebElement format2D;    //2d формат

    public WebElement getTitle() {
        return title;
    }

    public WebElement getWaitTime() {
        return waitTime;
    }

    public WebElement getMetroStation() {
        return metroStation;
    }

    public WebElement getGenres() {
        return genres;
    }

    public WebElement getFormat2D() {
        return format2D;
    }
}
