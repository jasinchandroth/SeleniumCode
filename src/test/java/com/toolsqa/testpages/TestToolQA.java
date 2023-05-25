package com.toolsqa.testpages;

import com.toolsqa.base.TestBase;
import com.toolsqa.pages.Button;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestToolQA extends TestBase {
    Button bt;
    public TestToolQA(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        bt=new Button();
    }

    @Test
    public void testButton() throws InterruptedException {
        bt.setButtonClick();
        bt.setDoubleClick();
        Thread.sleep(1000);
        bt.validateDoubleClick();
    }

   @AfterMethod
    public void teardown(){
        driver.quit();
    }




}
