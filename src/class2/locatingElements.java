package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {

    public static void main(String[] args) {
        //tell your priject whwre the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of WEbDriver
        WebDriver driver= new ChromeDriver();

        // open up FB
        driver.get("https://www.facebook.com/");

        // send in the username
        driver.findElement(By.id("email")).sendKeys("Liana");

        // send the password
        driver.findElement(By.name("pass")).sendKeys("12345");

        // click on the button create new account

        //linkText--
        // attribute - href= is a link!!
        // links are when it starts with a tag "<a"
        // and it has to have a text (before closing (/a)
      //  driver.findElement(By.linkText("Create new account")).click();


        //click on forgot password
        driver.findElement(By.partialLinkText("password?")).click();
        driver.quit();
    }
}
