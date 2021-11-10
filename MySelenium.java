package MySelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MySelenium {
@Test
	public void JenkinsTest() {
			      	 
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	          if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	        //close Fire fox
	        driver.close();
	       
	}

}


