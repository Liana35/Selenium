package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW2 {
    public static void main(String[] args) {
/*
        1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page*/

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
       driver.switchTo().frame(0);
       WebElement textBox = driver.findElement(By.xpath("//p"));

       textBox.clear();
       textBox.sendKeys("Hello World!");
        driver.switchTo().defaultContent();
    }
}
