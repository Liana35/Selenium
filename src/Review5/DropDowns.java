package Review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/contact-sales/");
        driver.manage().window().maximize();
        WebElement countryDdl = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select country = new Select(countryDdl);
        //country.selectByIndex(12);
        //country.selectByValue("India");
        country.selectByVisibleText("Brazil");
    }
}
