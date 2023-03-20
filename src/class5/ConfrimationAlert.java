package class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfrimationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");


        driver.findElement(By.xpath("//button[@onclick='myAlertFunction() ']"));

       Alert alert = driver.switchTo().alert();
        Thread.sleep(1500);
        alert.accept();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction']")).click();

        alert.sendKeys("abracadabra");
        alert.accept();
    }
}
