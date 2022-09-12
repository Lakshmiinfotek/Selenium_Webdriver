package Mavselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlearnwithcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/free-courses/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time before it throws 
		//a "No Such Element Exception". 
		// The default setting is 0. 
		// Once we set the time, the web driver will wait for the element for that time before throwing an exception

		driver.manage().window().maximize();
		WebElement checkboxDevopsAcademy = driver.findElement( By.linkText("Devops Academy"));
		checkboxDevopsAcademy.click();
 
	
		
	}

	

	}

