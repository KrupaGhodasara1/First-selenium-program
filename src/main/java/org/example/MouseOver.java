package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseOver {

    public static WebElement mouse;

    public static void main(String[] args) {
        System.setProperty("WebDriv0.er.Chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://sellglobal.ebay.in/seller-center/start-selling/");

        WebElement ele = driver.findElement(By.linkText("Selling"));

        Actions act = new Actions(driver);

        act.moveToElement(ele).perform();

        WebElement ab = driver.findElement(By.linkText("eBay For Business"));

        Actions acte = new Actions(driver);

        act.moveToElement(ab).perform();

      //  driver.close();



    }
}
