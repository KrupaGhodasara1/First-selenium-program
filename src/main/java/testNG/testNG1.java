package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class testNG1 {

    @BeforeTest
    public void beforetest(){
        System.out.println("before test....");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("brfore class....");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method....");
    }
    //samsaung
    //apple
    //oppo
    @DataProvider(name = "search data set")
    public Object[][] searchdata(){
        Object[][] searchkword = new Object[3][1];
        searchkword[0][0] = "samsaung";
        searchkword[1][0] = "apple";
        searchkword[2][0] = "oppo";

        return searchkword;
    }

    @Test(dataProvider = "search data set")
   static void searchdata(String Mobiles){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://www.gadgetsgallery.in/");

       // Assert.assertEquals(driver.getTitle(),"Gadgets Gallery Online Shopping Site For Mobiles, Electronics, IT, Personal Care & More. - Gadgets Gallery");
        String title = driver.getTitle();
        System.out.println(title);

        driver.findElement(By.id("search")).sendKeys(Mobiles);
        driver.findElement(By.xpath("//i[@class='ec ec-search']")).click();








    }

}
