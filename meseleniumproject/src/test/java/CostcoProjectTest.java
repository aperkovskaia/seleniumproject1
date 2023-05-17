/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author aperk
 */
public class CostcoProjectTest {
    private WebDriver driver;
    public CostcoProjectTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwskwzNlJgNGB0YPBiS84vLknOBwA9pQWy&q=costco&rlz=1C1VDKB_enUS1014US1015&oq=cos&aqs=chrome.1.0i355i433i512j46i199i433i465i512j69i64j46i175i199i512j0i131i433i512j69i60l3.5545j0j7&sourceid=chrome&ie=UTF-8");
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwskwzNlJgNGB0YPBiS84vLknOBwA9pQWy&q=costco&rlz=1C1VDKB_enUS1014US1015&oq=cos&aqs=chrome.1.0i355i433i512j46i199i433i465i512j69i64j46i175i199i512j0i131i433i512j69i60l3.5545j0j7&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/a/h3")).click();
    driver.get("https://www.costco.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//form[@id='formcatsearch']/div[2]/button/i")).click();
    driver.findElement(By.id("search-field")).clear();
    driver.findElement(By.id("search-field")).sendKeys("women dress");
  
    driver.findElement(By.id("formcatsearch")).submit();
    //driver.wait(5000);
    //driver.findElement(By.xpath("//*[@id=\"addbutton-1\"]")).click();
    //driver.findElement(By.xpath("//fieldset[@id='swatchesID-productOption00']/span[2]/label/span")).click();
    //driver.findElement(By.xpath("//fieldset[@id='swatchesID-productOption01']/span[2]/label/span")).click();
    //driver.findElement(By.id("add-to-cart-btn")).click();
    //driver.findElement(By.xpath("//div[@id='costcoModalText']/div[2]/div[2]/a/button")).click();
}
}