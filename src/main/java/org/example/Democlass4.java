package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Democlass4 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/");

        //click on form
        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();

        //click on practise form
        driver.findElement(By.xpath("//span[text()='Practice Form']")).click();

        //click and type on first field
        driver.findElement(By.id("firstName")).sendKeys("abcd");
        driver.findElement(By.id("lastName")).sendKeys("EFGHU");

        //click and enter email id
        driver.findElement(By.id("userEmail")).sendKeys("abcd@demo.com");

        //click on gender button
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();

        //enter mobile number
        driver.findElement(By.id("userNumber")).sendKeys("123456789");

        //click on date of birth field
        driver.findElement(By.id("dateOfBirthInput")).click();

        WebElement ele = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")); //month

        Select month = new Select(ele);

        month.selectByValue("11");

        WebElement elem = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")); //year

        Select year = new Select(elem);

        year.selectByValue("2000");

        driver.findElement(By.xpath("//div[text()='15']")).click(); //date

        //click on subject field

        String subject="Maths";

       WebElement element= driver.findElement(By.xpath("//div[@id='subjectsWrapper']//input[@id='subjectsInput']"));
       element.sendKeys(subject);
       element.sendKeys(Keys.ENTER);

        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='css-12jo7m5 subjects-auto-complete__multi-value__label']")); //100

        for(WebElement e:elements){ //advanced for loop

            if(e.getText().equals("maths")){

                System.out.println("Computer is available ");
            }
            else{

                System.out.println("Computer is not available ");
            }

        }
        //click on check box
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]")).click();

        //upload image file
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\IPS-124\\Downloads\\images (3).jpg");

        //click on address
        driver.findElement(By.id("currentAddress")).sendKeys("jsndjsfhjshjfgjhfbjhdfbjdf");









    }
}
