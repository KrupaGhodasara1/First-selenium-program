package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Democlass7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://demoqa.com/");

        //Click on interaction

        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[5]")).click();

        driver.findElement(By.xpath("//span[text()='Selectable']")).click();

        List<WebElement> elements=driver.findElements(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action']"));

        int listsize = elements.size();
        System.out.println("list size is " +listsize);

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL)
                .click(elements.get(0))
                .click(elements.get(1))
                .click(elements.get(2))
                .build().perform();

        driver.findElement(By.id("demo-tab-grid")).click();
        List<WebElement> elements1=driver.findElements(By.xpath("//li[@class='list-group-item list-group-item-action']"));

        int listsize1 = elements1.size();
        System.out.println("list size is :" +listsize1);

        action.keyDown(Keys.CONTROL)
                .click(elements1.get(0))
                .click(elements1.get(1))
                .click(elements1.get(2))
                .click(elements1.get(3))
                .click(elements1.get(4)).build().perform();

        // click on resizeble

        JavascriptExecutor mouse3 = (JavascriptExecutor) driver; // window scroll vertically

        mouse3.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        driver.findElement(By.xpath("//span[text()='Resizable']")).click();

        Thread.sleep(6000);

        WebElement element2 = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
        action.clickAndHold().moveToElement(element2,500,300).perform();
        Thread.sleep(15000);
     //   action.dragAndDropBy(element2,500,300).perform();

        //drag and drop

       /* JavascriptExecutor mouse4 = (JavascriptExecutor) driver; // window scroll vertically

        mouse4.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically


        driver.findElement(By.xpath("//span[text()='Droppable']")).click();

        Thread.sleep(6000);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        action.dragAndDrop(source,target).build().perform();

        String textTo = target.getText();

        if(textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        }else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }
*/
        driver.close();




    }
}
