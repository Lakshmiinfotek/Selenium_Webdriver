package facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Creatingaccount {

	private static final By driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Finding elements BY different locators
		driver.findElement(By.name("firstname")).sendKeys("Krish");
		driver.findElement(By.name("lastname")).sendKeys("Meduri");
		driver.findElement(By.name("reg_email__")).sendKeys("Medurirupa@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Medurirupa@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Abcdefgh1234");

		// Dropdown Month Select By visibletext
		// Select class is used in case of Dropdown. Select class object countrySelect
		// specifies the webElement location.
		Select Monthselect = new Select(driver.findElement(By.id("month")));
		Monthselect.selectByValue("7");

		// Drop down Date SelectByvalue
		Select DaySelect = new Select(driver.findElement(By.id("day")));
		DaySelect.selectByValue("26");

		// Dropdown selectByvalue
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		yearSelect.selectByValue("2001");
		
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		
		// Radiobutton
		WebElement RadiobuttonFemale = driver.findElement(By.xpath("//*[@id=\"u_0_4_K7\"]"));
		RadiobuttonFemale.clear();
		RadiobuttonFemale.click();
		
		// Submit button
		 driver.findElement(By.id("u_0_s_HF")).submit();
	
		
		driver.findElement(By.id("recovery_code_entry")).sendKeys("339126");
		driver.findElement(By.name("reset_action")).submit();
		System.out.println("form cancelled");

	}

}
//Doubts:
//first i run the test then i went upto login form 
// Second time i run the test it stops after radio button 
// here it is not proceeding the next step

	