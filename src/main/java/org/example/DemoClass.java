package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class DemoClass {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Launch amazonweb page
        driver.navigate().to("https://www.saucedemo.com/v1/");

        // get title and print
        String title = driver.getTitle();
        System.out.println("title :  " + title);

        // get URL and print
        System.out.println("url" +driver.getCurrentUrl());

        // locate username,password and login butoon by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        //switch to product page
        String currentWindowHandle = driver .getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //locate Test.allTheThings() T-Shirt (Red)
       //driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();

        //for partiallinktext
       // driver.findElement(By.partialLinkText("Sauce")).click();

        //for findelements
        //driver.findElements(By.partialLinkText("Sauce"));

        //Click by xpath
       driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
        driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]")).click();


        Thread.sleep(1000);
        driver.close();
    }
}
