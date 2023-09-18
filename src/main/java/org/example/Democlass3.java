package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Democlass3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdrive.chorme.drive", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        //launch webpage
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();// for maximize window

        driver.navigate().to("https://demoqa.com/");

        //CLICK ON ELEMENT
        driver.findElement(By.xpath("//div[@class='avatar mx-auto white']")).click();

        driver.findElement(By.className("icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("icon")).click();


        //click on textbox
        driver.findElement(By.id("item-0")).click();
        Thread.sleep(2000);

        //fill all textbox
        driver.findElement(By.id("userName")).sendKeys("KRUPA");
        driver.findElement(By.id("userEmail")).sendKeys("test123@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("jhfgjdjhfgjhfghjfghjfgjf");
        driver.findElement(By.id("permanentAddress")).sendKeys("jhfgjdjhfgjhfghjfghjfgjf");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        //Click on check box
        driver.findElement(By.id("item-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("rct-checkbox")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("rct-checkbox")).click();

        //Click on radiobutton
        driver.findElement(By.id("item-2")).click();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();

        //Click on webtables
        driver.findElement(By.id("item-3")).click();
        //driver.findElement(By.className("form-control")).sendKeys("Alden"); //for search
        driver.findElement(By.id("delete-record-2")).click(); // for delete record
        driver.findElement(By.id("addNewRecordButton")).click(); //click on add button
        driver.findElement(By.id("firstName")).sendKeys("krupa");
        driver.findElement(By.id("lastName")).sendKeys("Test");
        driver.findElement(By.id("userEmail")).sendKeys("krupa@example.com");
        driver.findElement(By.id("age")).sendKeys("24");
        driver.findElement(By.id("salary")).sendKeys("25000");
        driver.findElement(By.id("department")).sendKeys("QA");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(20000);

        //For window scrolling verically

        JavascriptExecutor JS = (JavascriptExecutor) driver; // window scroll vertically

        JS.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        // for droup down

        WebElement element = driver.findElement(By.xpath("//select[@aria-label='rows per page']")); // for droupdown

        Select selectobject = new Select(element); // for droup down

        selectobject.selectByValue("5");
        selectobject.selectByValue("10");
        selectobject.selectByValue("20");

        //for button
        driver.findElement(By.id("item-4")).click();

        //for double click
        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));  // doubleclick = object name

        Actions action = new Actions(driver);  // Action = class name   and   action = object name
        action.doubleClick(doubleclick).build().perform(); // for double click

        action.contextClick(driver.findElement(By.id("rightClickBtn"))).perform(); // for righgt click

        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();

        //click on link
        //driver.findElement(By.id("item-5")).click();

        // driver.findElement(By.xpath("//a[text()='Home']")).click();
        // driver.findElement(By.linkText("Home")).click();


        // Click on broken images
        //driver.findElement(By.xpath("//span[text()='Broken Links - Images']")).click();
        
        // Click on download and upload images
        Thread.sleep(5000);
        //  driver.findElement(By.xpath("(//li[@class='btn btn-light '])[7]")).click();
        // driver.findElement(By.className("btn btn-light ")).click();
        //  driver.findElement(By.id("item-7")).click();
        WebElement element1 = driver.findElement(By.xpath("((//span[@class='text'])[8]"));
        JS.executeScript("arguments[0].scrollIntoView(true);", element1);
        Thread.sleep(6000);
        //  driver.findElement(By.xpath("//span[text()='Upload and Download']"))
        //  driver.close();


    }
}
