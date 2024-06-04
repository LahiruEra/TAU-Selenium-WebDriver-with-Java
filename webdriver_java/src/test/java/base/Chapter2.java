package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter2 {
	
	private WebDriver driver;

    public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lahiru\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();

        //driver.quit();
    }

    public static void main(String args[]){
        Chapter2 test = new Chapter2();
        test.setUp();
    }

}
