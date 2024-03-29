package Mavselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceseleniumwithmav2 {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
			  ChromeDriver driver = new ChromeDriver();
					  
		   
		    driver.get("http://jqueryui.com/droppable/");
	      // focusing inside the frame - Frame WebElement
	      driver.switchTo().frame(0);
	      // using x path
	      WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	      WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
	      
	      // message for console - checking execution flow of program
	      System.out.println("opening page...perform drag and drop");
	      Thread.sleep(3000);
	      Actions act = new Actions(driver);//act is an object AND DRIVER IS  USING AS A PARAMETER.
	      
	      // dragAndDrop is the method() of class Action
	      act.dragAndDrop(source, target).build().perform();//Method is a drag and drop
	      System.out.println("drag N drop Done...");
	      Thread.sleep(3000);
	      driver.close();

	}

}
