package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Launch saucedemo app
        driver.navigate().to("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize(); // to maximize window

        //Get title and print
        String Title = driver.getTitle();
        System.out.println("Title: " + Title);

        //Get URL nad print
        String URL = driver.getCurrentUrl();
        System.out.println("URL: " +URL);

        Thread.sleep(5000);

        //Locators by Xpath
        driver.findElement(By.xpath("//input[@class='form_input']")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[ @id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();



    }
}
