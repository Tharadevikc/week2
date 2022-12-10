package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/loc");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//ctrl+2,L
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); //sendkeys(keys.ENTER)
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sai Technology");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TharavDevi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K C");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Thara");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sai Technology is the leading service provider");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tharadevikc@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ss = new Select(State);
		ss.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);
		System.out.println("The Title is :" +driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sai info limited");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tharavivek");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is :" +driver.getTitle());


	}

}
