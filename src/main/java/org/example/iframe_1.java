package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframe_1 {
    public static void main(String[] args) {

        System.setProperty("WebDriver.Chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

        //Total number of Iframe
        List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
        System.out.println("The total number of iframes are " + iframeElements.size());

        //switch to iframe
        driver.switchTo().frame("globalSqa");

        driver.findElement(By.xpath("(//div[@class='pic_info type6'])[1]")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("google_esf");

        driver.findElement(By.linkText("Tooltip")).click();



    }
}
