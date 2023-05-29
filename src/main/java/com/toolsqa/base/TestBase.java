package com.toolsqa.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;
    public static Actions act;

    public TestBase(){
        try {
            prop=new Properties();
            FileInputStream ip=new FileInputStream("D:\\MyJavaProjects\\ToolsQAProject\\SeleniumCode\\src\\main\\java\\com\\toolsqa\\properties\\config.properties");
            prop.load(ip);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


    public static void initialization(){
        String browserName= (String) prop.getProperty("browser");
        if (browserName.equals("chrome")){
            System.getProperty("webdriver.chrome.driver","D:\\MyJavaProjects\\chromeDriver\\chromedriver.exe");
            driver=new ChromeDriver();

        }
        act=new Actions(driver);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


    }

    public static void scrollPage(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);

    }
}
