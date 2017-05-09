package com.bifit.fw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageSetFilter extends PageBase{

    @FindBy(xpath = "//span[@name='clb6796617']")
    private WebElement buttonInsKino;  //кнопка в кино

    @FindBy(xpath = "//form/div/div/div/div/i")
    private WebElement buttonSelectorWaitTime; //кнопка раскрывающая выпадающий список

    @FindBy(xpath = "//form/div[1]/div[1]/div/div[2]/div[1]/div[2]")
    private WebElement waitTime;    //когда (число время)

    @FindBy(xpath = "//input[@placeholder='Станции метро']")
    private WebElement fieldMetroStation;//на какой станции

    @FindBy(xpath = "//div[@data-id='68']")
    private WebElement listStationSearch; //найденный станции по поиску

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[1]/i")
    private WebElement buttonSelectorGenres;      //кнопка раскрывающая выпадающий список жанров

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[2]/div[1]/div[2]/label")
    private WebElement tragedy;  //драма

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[2]/div[1]/div[3]/label")
    private WebElement comedy;   //комедия

    @FindBy(xpath = "//form/div[2]/span[1]/div/div[1]/label")
    private WebElement format2D;    //2d формат

    @FindBy(xpath = "//button[@name='clb6796813']")
    private WebElement buttonFind;     //кнопка подобрать

    public WebElement getButtonInsKino() {
        return buttonInsKino;
    }

    public WebElement getButtonSelectorWaitTime() {
        return buttonSelectorWaitTime;
    }

    public WebElement getWaitTime() {
        return waitTime;
    }

    public WebElement getFieldMetroStation() {
        return fieldMetroStation;
    }

    public WebElement getListStationSearch() {
        return listStationSearch;
    }

    public WebElement getButtonSelectorGenres() {
        return buttonSelectorGenres;
    }

    public WebElement getTragedy() {
        return tragedy;
    }

    public WebElement getComedy() {
        return comedy;
    }

    public WebElement getFormat2D() {
        return format2D;
    }

    public WebElement getButtonFind() {
        return buttonFind;
    }

}
