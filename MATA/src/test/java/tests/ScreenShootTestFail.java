package tests;

import base.BaseTest;

public class ScreenShootTestFail extends BaseTest {

    public void checkMainPageScreen(){
        openApp()
                .checkFailScreenshot();
    }

}
