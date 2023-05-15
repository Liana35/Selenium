package Review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/contact-sales/");
        WebElement countryDdl = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select country = new Select(countryDdl);
        List<WebElement> countrylist = country.getOptions();
        for (WebElement nation : countrylist) {
            String countryName = nation.getText();
            if (countryName.equalsIgnoreCase("Australia")) {
                nation.click();
                break;
    }
}
        // the tag of dropwdon has to be <select to be able to use this method
    }
}