package week2.day1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElementByLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Create Lead").click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jose");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Paul");
		WebElement Source= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select S=new Select(Source);
		S.selectByValue("LEAD_EXISTCUST");
	    /*WebElement Campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select Market=new Select(Campaign);
		Market.selectByValue("Automobile");
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select Owner=new Select(Ownership);
		Owner.selectByValue("Partnership");*/ //not working
		
		
		
		 
			
			
			
			
			

}

}

