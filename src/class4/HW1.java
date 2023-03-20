package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

       /* check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement button= driver.findElement(By.cssSelector("input[type = 'checkbox']"));

        boolean isSelected= button.isSelected();
        System.out.println("Is the check box selected? - "+isSelected);
       // button.click(); or
        if(!isSelected){
            button.click();
        }
     isSelected=button.isSelected();
        System.out.println("the updated status of selection is - "+isSelected);

    }
}
