package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.switchTo().frame("iframeResult");
        WebElement doubleClickBtn= driver.findElement(By.xpath("//button[text()='Copy Text']"));
        Actions act=new Actions(driver);
        act.doubleClick(doubleClickBtn).perform();
        // click field one and add your own value and click
        //copy text button and print it out

        WebElement fieldOna= driver.findElement(By.xpath("//input[@id='field1']"));
        fieldOna.clear();
        fieldOna.sendKeys("Changed text");

        String text= doubleClickBtn.getText();
        System.out.println(text);
    }
}
