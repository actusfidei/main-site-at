package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchTest extends BaseTest {
    @Test
    public void SearchTest() throws InterruptedException {


        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElement(By.cssSelector("input[class=\"search-panel__search-field\"]")).sendKeys("java");


        int prof = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")).getText());
        Assertions.assertTrue(prof >= 2);

        int course = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/span[1]")).getText());
        Assertions.assertTrue(course > 15);

//        int webinar = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/span[1]")).getText());
//        Assertions.assertTrue(webinar >= 180 & webinar <= 300);
//        Assertions.assertEquals(chromeDriver.findElement(By.xpath("(//a[contains(@class,'event__title h3')])[1]")).getText(), "Java Junior. Что нужно знать для успешного собеседования?");

        int blog = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")).getText());
        Assertions.assertTrue(blog >= 300);

        int forum = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/span[1]")).getText());
        Assertions.assertNotEquals(350, forum);

        int test = Integer.parseInt(chromeDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]/span[1]")).getText());
        Assertions.assertNotEquals(0, test);
        Assertions.assertTrue(chromeDriver.findElement(By.linkText("Образовательный портал GeekBrains")).isDisplayed());
    }



}
