package com.bifit.firsttest;

import com.bifit.fw.TestBase;
import org.junit.*;


public class KinoFindTest extends TestBase {

    @Test
    public void testKinoFind() throws Exception {
        manager.getDriver().get("https://afisha.mail.ru/");
        manager.getHelperSetFilter().setFiltersAndFindFilm();
        manager.getHelperResult().equalsResult();
    }
}

