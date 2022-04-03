package tests;

import base.BaseTest;

public class ScreenShootTest extends BaseTest {

    public void checkMainPageScreen(){
        openApp()
                .checkScreenshot();
    }
}
