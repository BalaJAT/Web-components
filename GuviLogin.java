package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GuviLogin {
	
	public static void main(String[] args) {
        // Set the path to your Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\Automation directory\\TestAutomation\\drivers\\msedgedriver.exe");

        // Open Edge browser
        WebDriver driver = new EdgeDriver();

        // Navigate to guvi website 
        driver.get("https://www.guvi.in/");
        //windows time sleep is implemented
        try {
            Thread.sleep(5000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       //click on the signup link
        driver.findElement(By.linkText("Sign up")).click();
        // maximize the windows
        driver.manage().window().maximize();

        //send value for  Name
        WebElement name=driver.findElement(By.id("name"));
        name.sendKeys("Balamanikandan");
        //send value for  emailid 
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("vijaybala19595@gmail.com");
      //send value for password
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("karthick@1");
      //send value for mobilenumber 
        WebElement mobilenumber =driver.findElement(By.id("mobileNumber"));
        mobilenumber.sendKeys("9940542305");
        //click on the signup link
        WebElement signup =driver.findElement(By.id("signup-btn"));
        signup.click();
        
      //windows time sleep is implemented
        try {
            Thread.sleep(5000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      // select currentprofile from dropdown1
        WebElement dropdown1=driver.findElement(By.id("profileDrpDwn"));
        
        Select currentprofile=new Select(dropdown1);
        currentprofile.selectByIndex(2);
     // select degree from dropdown2
        WebElement dropdown2=driver.findElement(By.id("degreeDrpDwn"));
        Select degree=new Select(dropdown2);
        degree.selectByIndex(3);
        // send value for year of passing
        WebElement year =driver.findElement(By.id("year"));
        year.sendKeys("2016");
        
        WebElement submit =driver.findElement(By.id("details-btn"));
        submit.click();
    
      //windows time sleep is implemented
        try {
            Thread.sleep(5000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   
       //login page appears enter the details in the login page  
 
      //send value for enter emailid 
        WebElement emailid=driver.findElement(By.id("email"));
        emailid.sendKeys("vijaybala19595@gmail.com");
      //send value for password
        WebElement password1=driver.findElement(By.id("password"));
        password1.sendKeys("karthick@1");
        //click on the login link
        WebElement login =driver.findElement(By.linkText("Login"));
        login.click();
        
        driver.quit();
	}
}
