package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWXpath {

    public static void main(String[] args) {


       /* enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");

        WebElement username8  = driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your Message')]"));
        username8.sendKeys("Testing");
       // driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
        //or by finding by attribute
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Enter value')]")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        WebElement username9 =  driver.findElement(By.xpath("//button[text()='Get Total']"));
        username9.click();
        System.out.println( username9.getText());
    }
}
