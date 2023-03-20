package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2 {
    public static void main(String[] args) {

        /*u need to write down the code that can select  1 check box out of 4 mentioned,
                e.g option1 , option2 , option 3, option 4
        Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBox = driver.findElements(By.cssSelector("input[class='cb1-element']")); // or input[value^='Option']
        String selectOption="Option-3"; // change to any other value to sleect a different check box
        for (WebElement check:checkBox){
            String button = check.getAttribute("value");
            System.out.println(button);  //  checking what values are available
            if(button.equalsIgnoreCase(selectOption)){   // if(button.equalsIgnoreCase("Option-3"))  if we dont have  String "selectOption"
                check.click();
            }
        }




    }
}
