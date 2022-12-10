package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stubps
WebDriverManager.chromedriver().setup();
//System.setProperty("webdriver.chrome.driver", "/loc");

ChromeDriver driver= new ChromeDriver();
WebDriver driver1= new FirefoxDriver();


driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
//ctrl+2,L
WebElement eleUsername = driver.findElement(By.id("username"));
eleUsername.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click(); //sendkeys(keys.ENTER)
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sai");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thara");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
WebElement eletool = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dd =new Select(eletool);
dd.selectByValue("LEAD_EMPLOYEE");

driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);

//WebElement text = driver.findElement(By.id("viewLead_firstName_sp"));





//Thread.sleep(2000);
//driver.close();

}
	
	
}