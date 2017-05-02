package com.bifit.firsttest;

import org.junit.*;

public class KinopoiskTest extends TestBase{

    @Test
    public void testUntitled() throws Exception {
        goToMainPage().setFiltersAndFindFilm().equalsResult();
    }
}

