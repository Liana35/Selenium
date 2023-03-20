package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LastButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        WebElement buttonFour= driver.findElement(By.xpath("//button[@id='checkbox']"));
        buttonFour.click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        WebElement checkBox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ch']")));
        System.out.println(checkBox.isSelected());

    }
}
