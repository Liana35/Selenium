package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();



//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

//        click on the radio button Male
                WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        // check if the radio button is Enabled
         boolean isEnabled=maleBtn.isEnabled();
        System.out.println("radio button male is enabled "+ isEnabled);
        // check id radio button is displayed
       boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        // check if radio button male is selected
       boolean isSlecetedMale= maleBtn.isSelected();
        System.out.println("The male button is selected "+isSlecetedMale);
// will be false if  click is before sout
        // if radio button is not selected click on it
        if(!isSlecetedMale) {
            maleBtn.click();
        }
        // check if radio button is selected after the click
        // check it again
        isSlecetedMale= maleBtn.isSelected();
        System.out.println("the status of selection is "+isSlecetedMale);
    }
}
