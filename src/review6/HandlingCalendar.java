package review6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingCalendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
        //1.Identify the date
        String year= "2023";
        String month="Aug";
        String date="19";

        //Click on Calendar(date picker)
        driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
        while(true){
            //3. Capture year and month
            String monthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
            String[] ym= monthYear.split(" ");
            if(ym[0].equalsIgnoreCase(month)&& ym[1].equalsIgnoreCase(year)){
                //perform some operation
              List <WebElement> dates= driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr/td"));
              for(WebElement dt: dates){
                  if(dt.getText().equalsIgnoreCase(date)){
                      dt.click();
                      break;
                  }
              }


            } else{
                driver.findElement(By.xpath("//td[@class='next']")).click();
            }
        }
    }
}
