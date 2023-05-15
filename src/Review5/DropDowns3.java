package Review5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDowns3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // doesn't upload ?
        driver.get("https://www.hdfcbank.com/");
        WebElement productTypeDdl = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
        productTypeDdl.click();
        List<WebElement> productType = driver.findElements(By.xpath("//div[@class='dropdown open']//li"));

        for (WebElement product : productType) {
            String productName = product.getText();
            if (productName.equalsIgnoreCase("Loans")) {
                product.click();
                break;
            }
        }
        
    }
}
