package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple]")).sendKeys("C:\\Users\\liana\\Desktop\\TestNG.txt");  // or //input[@type='file' and @multiple]

        // Note: This will work only for those file upload button for which the tag name is input and type is file
        // sendKeys use
        // 1. entering values in the text boxes
        // 2. uploading the file
        // 3. for performing the keyboard interactions

        // to scroll, Drag and drop,  double, hover
        // Mouse Actions
        // How to perform right click
        // How to perform double click
        // How to perform drag and drop
        // How to perform Mouse hover
    }
}
