package class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        WebElement button=driver.findElement(By.xpath("//button[@id='populate-text']"));
        button.click();
        String text=button.getText();
        System.out.println(text);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("h2")));

        WebElement buttonTwo =driver.findElement(By.xpath("//button[@id='display-other-button']"));
        buttonTwo.click();
      WebElement hiddenButton=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("button two is displayed "+hiddenButton.isDisplayed());

        WebElement buttonThree =driver.findElement(By.xpath("//button[@id='enable-button']"));
        buttonThree.click();
        WebElement hiddenButton3= wait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
        System.out.println("hidden button 3 is enabled - "+hiddenButton.isEnabled());


    }
}
