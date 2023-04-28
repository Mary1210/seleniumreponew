package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class intitatedriver {
    public static WebDriver driver;
    @BeforeSuite
    public static void openBrowser()  {
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeoptions);
        driver.get("https://subscribe.stctv.com/");
    }

    @AfterSuite
    public static void quitDriver() {
        driver.quit();
    }

}
