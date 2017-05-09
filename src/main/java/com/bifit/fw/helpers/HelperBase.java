package com.bifit.fw.helpers;

import com.bifit.fw.ApplicationManager;
import org.openqa.selenium.WebElement;

import org.apache.log4j.Logger;

public class HelperBase {
    protected ApplicationManager manager = ApplicationManager.manager;
    private static final Logger logger = Logger.getLogger(HelperBase.class);

    public static Logger getLogger() {
        return logger;
    }

    public void click(WebElement element){
        logger.info("Нажатие на элемент \"" + element.toString() + "\"");
        element.click();
        logger.info("Нажатие элемента \"" + element.toString() + "\" было произведено успешно");
    }

    protected void clear(WebElement element){
        logger.info("Начало очистки значения элемента \"" + element.toString() + "\"");
        element.clear();
        logger.info("Очистка значений элемента \"" + element.toString() + "\" завершена успешно");
    }

    protected void sendKeys(WebElement element,String s){
        logger.info("Начало установки значения в элемент \"" + element.toString() + "\"");
        element.sendKeys(s);
        logger.info("установка значения в элемента \"" + element.toString() + "\" было произведена успешно");

    }
}
