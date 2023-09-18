package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass5 {
    public static void main(String[] args) {

        System.setProperty("WebDriver.Chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/");

        //click on new window

        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();

        driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();

        String window = driver.getWindowHandle();
        System.out.println("window handel : " +window);

        driver.findElement(By.id("windowButton")).click();

        //click onn alert button

       /* driver.findElement(By.xpath("//span[text()='Alerts']")).click();

        driver.findElement(By.id("alertButton")).click();  //click on alter button
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmButton")).click();  //click on confirm button
        driver.switchTo().alert().dismiss();

        driver.findElement(By.id("promtButton")).click();  //click on promtbutton
        driver.switchTo().alert().sendKeys("krupa");
        driver.switchTo().alert().accept();*/




    }
}
