package Mavselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitpractice {

	
		public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
	        ChromeDriver driver = new ChromeDriver();
	       
	        WebDriverWait wait=new WebDriverWait(driver, 20);
	        String SiteTitle = "Google";
	       
	        driver.get("http://google.com" );
	        
	        driver.manage().window().maximize() ;
	        
	        String getTitle = driver.getTitle();
	        //compare the actual title with the expected title
	        if (getTitle.equals(SiteTitle))
	        {
	        System.out.println( "Test Passed") ;
	        }
	        else {
	        System.out.println( "Test Failed" );
	        }
	        WebElement gmailLink;
	        gmailLink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[contains(text(),'Gmail')]")));
	        gmailLink.click();
	        //close browser
//	        driver.close();
	    }
	


	}


