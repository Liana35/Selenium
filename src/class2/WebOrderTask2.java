package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        navigate to the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        class1.maximize the website
                driver.manage().window().maximize();

//   user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

//        password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
//        click on login
        driver.findElement(By.className("button")).click();

//        verify that the title is "Web Orders"
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }
        else {
            System.out.println("the title is incorrect");
        }

//        logout
     driver.findElement(By.linkText("Logout")).click();

//        close the browser
   driver.quit();

    }
}
