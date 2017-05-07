package com.bifit.firsttest;

import org.junit.*;

public class KinoFindTest extends TestBase{

    @Test
    public void testKinoFind() throws Exception {

        Boolean result = goToMainPage().setFiltersAndFindFilm().equalsResult();
        
        if(result){
            System.out.println("Проверка теста успешна пройдена");
        }
        else{
            System.out.println("Тест проверку не прошел");
        }
    }
}

