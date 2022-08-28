package Mavselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousseautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver();
			 
		
		
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		WebElement Electronics=driver.findElement(By.linkText("Electronics"));
		 
		act.moveToElement(Electronics).click().build().perform();
		
		
		

	}

}
