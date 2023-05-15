package review6;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/?bc=HA");
        // take a screenshot and save it to a file
        TakesScreenshot ts= (TakesScreenshot) driver;
       File src= ts.getScreenshotAs(OutputType.FILE);

       // Save the screenshot to a specified location
        File target = new File("C:\\Users\\liana\\Desktop\\Selenium\\salesForce.png");
      // File target =  new File("C:\\Users\\liana\\Desktop\\Java screens\\Screen shorts\\salesForce.png");
       // "C:\Users\liana\Desktop\Selenium"
        FileUtils.copyFile(src,target);

    }
}
