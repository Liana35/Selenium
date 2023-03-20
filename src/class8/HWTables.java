package class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HWTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement loginBt= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        loginBt.sendKeys("Admin");
        WebElement passwordBt= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        passwordBt.sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();


        List<WebElement> id = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for(int i=0;i<id.size();i++){
            String text=id.get(i).getText();
            if(text.equalsIgnoreCase("52387A")){
                System.out.println("52387A is in the table on index "+(i+1));
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }

        }
    }
}
