package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HandlingExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://janbaskdemo.com/");
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000)); new version
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
    }
}
