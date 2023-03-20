package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {

        // connect class to a webdriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");  // second is the location

        // initiate an instance of webdriver
        WebDriver driver= new ChromeDriver();
        // open google.com
        driver.get("https://www.google.com/");
        // slow down
        Thread.sleep(2000);
        // navigate to facebook.com
        driver.navigate().to("https://www.facebook.com/");
        // slow down
        Thread.sleep(2000);
        // those are 2 methods
        driver.navigate().back();  // we can only do this with navigate, (to go back to google from facebook)
        // slow down
        Thread.sleep(2000);
        // go to facebook
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh after facebook
        driver.navigate().refresh();
        // close the browser
        driver.close();// close the current tab only
       // driver.quit();// will close the whole browser

    }
}
