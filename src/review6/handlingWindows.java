package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class handlingWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");
        WebElement freeTrialBtn= driver.findElement(By.xpath("//a[contains(@aria-label,'Start my free')][1]"));
        freeTrialBtn.click();
        Set<String> windowIds= driver.getWindowHandles();
        for (String id: windowIds){
            driver.switchTo().window(id);
            if(driver.getTitle().contains("Free CRM")){
                driver.findElement(By.name("UserFirstName")).sendKeys("Liana");
                driver.findElement(By.name("UserLastName")).sendKeys("Gasan");
            }
        }
        driver.quit();
    }
}
