package ru.lamoda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tamar on 20.12.2018.
 */
public class FirstTest {

    public ChromeDriver driver;

    @BeforeMethod
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamar\\IdeaProjects\\firstProject\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("start");

    }

    @Test
    public void firstTest() {
        driver.get("https://www.lamoda.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет магазин одежды и обуви. Купить обувь, купить одежду, аксессуары в онлайн магазине Lamoda.ru"));
        driver.findElement(By.xpath("*//[@id=\"menu-wrapper\"]/div/div[2]/a[3]/span")).click();
        driver.findElement(By.id("dfgdf"));
        List<WebElement> list = new ArrayList<WebElement>();

        ArrayList<int> list = new ArrayList<>();
    }

    @Test
    public void secondTest() {
        driver.get("https://www.lamoda.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет магазин одежды и обуви. Купить обувь, купить одежду, аксессуары в онлайн магазине Lamoda.ru"));
    }

    @AfterMethod
    public void destruct() {
        //driver.quit();
        System.out.println("end");
    }
}
