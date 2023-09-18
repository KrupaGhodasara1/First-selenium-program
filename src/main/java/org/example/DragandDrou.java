package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDrou {
    public static WebElement source,target;

    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

         //1
         source = driver.findElement(By.id("box6")); // source

         target = driver.findElement(By.id("box106")); // target

        Actions act = new Actions(driver);

        act.dragAndDrop(source,target).perform();

        //2
        source = driver.findElement(By.id("box7")); // source

        target = driver.findElement(By.id("box107")); // target

        Actions act1 = new Actions(driver);

        act1.dragAndDrop(source,target).perform();




    }
}
