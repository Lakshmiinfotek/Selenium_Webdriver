package Mavselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlearn360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //giving path and driver instance
		
		driver.get("https://www.itlearn360.com/");// open the browser using get commad
      
		driver.findElement(By.name("search_course")).sendKeys("automation selenium webdriver");// find element and pass value 
      
		
		
	}

	
		
	}


