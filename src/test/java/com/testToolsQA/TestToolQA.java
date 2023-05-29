package com.testToolsQA;

import com.toolsqa.base.TestBase;
import com.toolsqa.pages.Button;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestToolQA extends TestBase {
    Button bt;

    public TestToolQA() {
        super();

    }

    @BeforeMethod

    public void setBrowser() {
        initialization();
        bt = new Button();
    }

    @Test

    public void testButton() throws InterruptedException {
        bt.setButtonClick();
        //Thread.sleep(100);
        bt.setDoubleClick();
        Thread.sleep(1000);
        bt.validateDoubleClick();
    }

    @AfterMethod

    public void tear() {
        driver.quit();
    }

}
