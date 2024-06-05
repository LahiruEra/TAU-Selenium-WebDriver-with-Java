package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTests {

	private WebDriver driver;
	protected HomePage homePage;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lahiru\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/"); //adding the web url which need to visit
		
		
		homePage = new HomePage(driver); //call from the framework that we set
		
		driver.manage().window().maximize(); //manage().window() provide us methods to allow us to manage the window. ex: maximize(),fullscreen(),
		
		/*
		//1 - Maximize the window
        driver.manage().window().maximize();

        //2 - Fullscreen mode
        driver.manage().window().fullscreen();

        //3 - Specific width (show Chrome iPhoneX emulator)
        Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size);
        
        */
		
		System.out.println(driver.getTitle());  //will return web page title
		
		//driver.quit(); //this will close any of the windows that are open and complete out this session. There's also a close() method which will just close the window, but not necessarily the session.

	}
	
	public static void main(String args[]) {
		BaseTests test = new BaseTests();
		test.setUp();
	}

}
