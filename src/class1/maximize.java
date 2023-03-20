package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        // connect to the webdriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver= new ChromeDriver();
        // go to google.com
        driver.get("https://www.google.com/");
        // class1.maximize window
        driver.manage().window().maximize();
        // full screen
        driver.manage().window().fullscreen();
    }
}
