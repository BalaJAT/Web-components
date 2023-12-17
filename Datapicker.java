package learning.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Datapicker {
	
	public static void main(String[] args) {
        // Set the path to your Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\Automation directory\\TestAutomation\\drivers\\msedgedriver.exe");

        // Open Edge browser
        WebDriver driver = new EdgeDriver();

        // Navigate to jquery website 
        driver.get("http://jqueryui.com/datepicker/");
        // maximize the windows
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.switchTo().frame(0);
        // click on the datepicker iframe
        driver.findElement(By.id("datepicker")).click();
        //click on the next month
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        // click on the given date 
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")).click();
        //click on the datepicker iframe for printing in the console
        WebElement datePickerInput = driver.findElement(By.id("datepicker"));
        
     // Get the value of the selected date
        String selectedDate = datePickerInput.getAttribute("value");

        // Print the selected date to the console
        System.out.println("Selected Date: " + selectedDate);
       // quit the browser and all windows
        driver.quit();
 
	}

}
