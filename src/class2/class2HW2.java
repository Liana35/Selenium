package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements
        also u will need a Thread.sleep after clcikng on create new account*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Lilia");
        driver.findElement(By.name("lastname")).sendKeys("Malina");
        driver.findElement(By.name("reg_email__")).sendKeys("liana.jasanova@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("liana.jasanova@gmail.com");
       //driver.findElement(By.name("reg_passwd__")).sendKeys("512345LILI!");
        driver.findElement(By.id("password_step_input")).sendKeys("LOI123!");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
