package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2HW1 {
    public static void main(String[] args) {
       /* HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Lilia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Milonova");
        driver.findElement(By.id("customer.address.street")).sendKeys("7533 Inversham Dr");
        driver.findElement(By.id("customer.address.city")).sendKeys("Sherman Oaks");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("91422");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("57122357878");
        driver.findElement(By.id("customer.ssn")).sendKeys("555784358");
        driver.findElement(By.id("customer.username")).sendKeys("Lilia57");
        driver.findElement(By.id("customer.password")).sendKeys("12345LOP");
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345LOP");
        driver.findElement(By.className("button")).click();
        driver.close();


    }
}
