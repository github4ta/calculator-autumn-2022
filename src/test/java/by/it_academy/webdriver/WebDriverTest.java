package by.it_academy.webdriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class WebDriverTest{
    @Test
    public void testWebDriver(){
        // 1. создать экземпляр вэб драйвера
        String url = "https://www.onliner.by/";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode

        ChromeDriver driver = new ChromeDriver(options);
        //WebDriver driver = new SafariDriver();

        driver.get(url);
        String xPathBaraholkaLink = "//a[contains(@href, 'baraholka.onliner.by') and @class='b-main-navigation__link']";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathBaraholkaLink)));

        //WebElement elementLink = wait.until(presenceOfElementLocated(By.xpath(xPathBaraholkaLink)));
//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Tehingud")));

        WebElement elementLink = driver.findElement(By.xpath(xPathBaraholkaLink));



        //driver.
        driver.findElements(By.xpath(xPathBaraholkaLink));
        System.out.println(elementLink.getAttribute("outerHTML"));
        //elementLink.click();



        Actions builder = new Actions(driver);
        builder.clickAndHold(elementLink)
                .click()
                .build()
                .perform();

// Launch Website
        // 2. открыть вэб страницу

        driver.quit();

    }
}
