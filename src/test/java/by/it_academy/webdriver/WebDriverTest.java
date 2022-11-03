package by.it_academy.webdriver;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest{
    @Test
    public void testWebDriver(){
        // 1. создать экземпляр вэб драйвера
        String url = "https://www.onliner.by/";
        ChromeDriver driver = new ChromeDriver();
        // 2. открыть вэб страницу
        driver.get(url);

    }
}
