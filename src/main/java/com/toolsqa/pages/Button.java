package com.toolsqa.pages;

import com.toolsqa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Button extends TestBase {

    //Page Factory or object repository
    @FindBy(xpath = "//*[@id='item-5']")
    WebElement buttonClick;

    @FindBy(xpath = "//*[@id='doubleClickBtn']")
    WebElement doubleClick;

    @FindBy(xpath = "//*[@id='doubleClickMessage']")
    WebElement validateDoubleClick;



    //initializing the objects
    public Button() {
        PageFactory.initElements(driver, this);   //this statement is used to initialize the object.
    }

    public void setButtonClick(){
        ScrollPage(buttonClick);
        buttonClick.click();
    }

    public void setDoubleClick(){
       act.doubleClick(doubleClick).perform(); // this is to do the double click operation
        System.out.println("Double click is performed");
    }
    public boolean validateDoubleClick(){
        return validateDoubleClick.isDisplayed();
    }
}
