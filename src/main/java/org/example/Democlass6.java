package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Democlass6 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://demoqa.com/");

        //click on accordian

        driver.findElement(By.xpath("( //div[@class='card mt-4 top-card'])[4]")).click();

        driver.findElement(By.xpath("//span[text()='Accordian']")).click();

        driver.findElement(By.id("section1Heading")).click();

        driver.findElement(By.id("section2Heading")).click();

        driver.findElement(By.id("section3Heading")).click();

        //click on auto complete

       /* driver.findElement(By.xpath("//span[text()='Auto Complete']")).click();


        String color = "Yellow";

        WebElement element = driver.findElement(By.xpath("//div[@class=' css-2b097c-container']//div[@class='auto-complete__placeholder css-1wa3eu0-placeholder']"));

        // driver.findElement(By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']")).click();
        //element.click();
        element.sendKeys(color);
       // element.sendKeys(Keys.ENTER);
Thread.sleep(6000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']")); //100

        for (WebElement e : elements) { //advanced for loop

            if (e.getText().equals("Yellow")) {

                System.out.println("Yellow colour selected ");
            } else {

                System.out.println("yellow colour not available");
            }
        }
*/
        // Click on Datepicker

        driver.findElement(By.xpath("//span[text()='Date Picker']")).click();

        driver.findElement(By.id("datePickerMonthYearInput")).click();

        WebElement element22 =  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));

        Select month = new Select(element22);
        month.selectByValue("1");

        WebElement element1 = driver.findElement(By.className("react-datepicker__year-select"));

        Select year = new Select(element1);
        year.selectByValue("2025");

        Thread.sleep(5000);

        WebElement element4 =driver.findElement(By.xpath("//div[text()='16']"));

        element4.click();

        // Click on slider

        JavascriptExecutor JS = (JavascriptExecutor) driver; // window scroll vertically

        JS.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        //Thread.sleep(4000);
       WebElement exp = driver.findElement(By.xpath("//span[text()='Slider']"));
               exp.click();

       String acu ="Slider";

        WebElement slider = driver.findElement(By.className("range-slider__wrap"));

        Actions act = new Actions(driver);
        act.dragAndDropBy(slider,0,45).perform();


        if(exp.getText().equals(acu)){
        System.out.println("done");
        }

        JavascriptExecutor tab = (JavascriptExecutor) driver; // window scroll vertically

        tab.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically


        //Click on tab

        driver.findElement(By.xpath("//span[text()='Tabs']")).click(); //click on button

        String actual = "What";
        WebElement ele = driver.findElement(By.linkText("What"));

        if(ele.getText().equals(actual)){
            System.out.println("The text is what");
        }else {
            System.out.println("The text is not what");
        }
        driver.findElement(By.linkText("Origin")).click();

        //Click on mouse hover


        JavascriptExecutor mouse = (JavascriptExecutor) driver; // window scroll vertically

        mouse.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        driver.findElement(By.xpath("//span[text()='Tool Tips']")).click();

        WebElement mouseover = driver.findElement(By.xpath("//button[text()='Hover me to see']"));

        Actions actin = new Actions(driver);

        actin.moveToElement(mouseover).perform();

        WebElement overmouse = driver.findElement(By.linkText("1.10.32"));

        actin.moveToElement(overmouse).perform();


        //Click on menu

        JavascriptExecutor mouse1 = (JavascriptExecutor) driver; // window scroll vertically

        mouse1.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        String act1 = "Main Item 1";
        driver.findElement(By.xpath("//span[text()='Menu']")).click();

        WebElement menu1 = driver.findElement(By.linkText("Main Item 1"));

        actin.moveToElement(menu1).perform();

        if(menu1.getText().equals(act1)){
            System.out.println("yes, it's correct");
        }

        WebElement menu2 = driver.findElement(By.linkText("Main Item 2"));

        actin.moveToElement(menu2).perform();

        WebElement submenu = driver.findElement(By.linkText("Sub Item"));

        actin.moveToElement(submenu).build().perform();

        WebElement subsubmenu = driver.findElement(By.linkText("SUB SUB LIST »"));

        actin.moveToElement(subsubmenu).build().perform();

        WebElement subsub2 = driver.findElement(By.linkText("Sub Sub Item 1"));

        actin.moveToElement(subsub2).build().perform();

        //click on select menu

        JavascriptExecutor mouse2 = (JavascriptExecutor) driver; // window scroll vertically

        mouse2.executeScript("window.scrollBy(0,1000)", "");//window scroll vertically

        driver.findElement(By.xpath("//span[text()='Select Menu']")).click();

        driver.findElement(By.id("selectMenuContainer")).click();

        driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();












    }
}
