package Mavselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class itlearnpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/free-courses/");
		driver.manage().window().maximize();
		
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());// we will get a msg what ever is in the popup window
		Thread.sleep(3000);
		alert1.accept();
		// this program is not working.

	}

}
