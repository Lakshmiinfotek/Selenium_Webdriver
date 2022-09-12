package Mavselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itlearnlinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver();


  driver.get("https://www.itlearn360.com/");
  driver.findElement(By.linkText("Jobs")).click();// get job  page

//linktext and xpath locators

//driver.findElement(By.linkText("Log in")).click();// login page
//driver.findElement(By.linkText("Get Started")).click();// get started  page
//driver.findElement(By.xpath("//*[@id=\"menu-item-13318\"]/a/span")).click();//bloglink
//driver.findElement(By.xpath("//*[@id=\"menu-item-12194\"]/a/span")).click();//free courses
//driver.findElement(By.linkText("Online Classes")).click();





	}

	}


