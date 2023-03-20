package class5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");


        // get  the drop Down
        WebElement DD= driver.findElement(By.xpath("//select[@id='multi-select']"));

        // use the select class
        Select sel= new Select(DD);

        // select by Value
        sel.selectByValue("New Jersey");

        // select by Visible text

        sel.selectByVisibleText("Ohio");

        //to slow
        Thread.sleep(2000);

        // when it comes to MultiSelect Drop down we can also deselect

        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");

        sel.isMultiple();




    }
}
