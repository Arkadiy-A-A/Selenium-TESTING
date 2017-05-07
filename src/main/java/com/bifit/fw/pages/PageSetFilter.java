package com.bifit.fw.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSetFilter extends PageBase{

    @FindBy(css = "span[name=\"clb6796617\"] > span.filter__text")
    public WebElement buttonInsKino;  //кнопка в кино

    @FindBy(xpath = "//form/div/div/div/div/i")
    public WebElement buttonSelectorWaitTime; //кнопка раскрывающая выпадающий список

    @FindBy(xpath = "//form/div[1]/div[1]/div/div[2]/div[1]/div[2]")
    public WebElement waitTime;    //когда (число время)

    @FindBy(xpath = "//form/div[1]/div[2]/div/div/div[1]/div[2]/input")
    public WebElement fieldMetroStation;//на какой станции

    @FindBy(xpath = "//form/div[1]/div[2]/div/div/div[2]/div[2]")
    public WebElement listStationSearch; //найденный станции по поиску

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[1]/i")
    public WebElement buttonSelectorGenres;      //кнопка раскрывающая выпадающий список жанров

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[2]/div[1]/div[2]/label")
    public WebElement tragedy;  //драма

    @FindBy(xpath = "//form/div[1]/div[3]/div/div[2]/div[1]/div[3]/label")
    public WebElement comedy;   //комедия

    @FindBy(xpath = "//form/div[2]/span[1]/div/div[1]/label")
    public WebElement format2D;    //2d формат

    @FindBy(xpath = "//form/div[1]/div[5]/button")
    public WebElement buttonFind;     //кнопка подобрать

    //Установка различных фильтров на тестируемой странице
    public PageResult setFiltersAndFindFilm() {
        buttonInsKino.click();
        buttonSelectorWaitTime.click();
        waitTime.click();
        fieldMetroStation.clear();
        fieldMetroStation.click();
        fieldMetroStation.sendKeys("Курская");
        listStationSearch.click();
        buttonSelectorGenres.click();
        tragedy.click();
        comedy.click();
        format2D.click();
        buttonFind.click();
        return PageFactory.initElements(driver, PageResult.class);
    }

}
