package Mavselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class practiceSelwithmav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe");
		  ChromeDriver driver = new ChromeDriver(); 
		
				//ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.itlearn360.com/");
				System.out.println(driver.getTitle());

	}

}
