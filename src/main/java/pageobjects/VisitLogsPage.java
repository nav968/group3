package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisitLogsPage {
	WebDriver driver;
	public VisitLogsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUsername(String username) {
		WebElement uname = driver.findElement(By.name("userId"));
		uname.sendKeys(username);
		
	}

	public void enterPassword(String password) {
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
	}

	public void signinClick() {
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button.click();
	}
	public void visitLogs() {
		// TODO Auto-generated method stub
		WebElement visitLogs=driver.findElement(By.xpath("//span[@class='flex-1 ms-3 whitespace-nowrap']"));
		visitLogs.click();
	}

	public void addinstitutions() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		WebElement add=driver.findElement(By.xpath("//button[@class='flex  items-center gap-2 text-white bg-[#624DE3] hover:bg-[#624DE3] focus:ring-4 focus:ring-[#a79af8] rounded-lg text-[10px] md:text-sm px-2 md:px-5 py-2.5 me-2 mb- focus:outline-none dark:focus:ring-[#624DE3] h-[40px] w-[100px] md:w-[180px] font-semibold ']"));
		add.click();
	}
		public void setinstitutiontypes(String type) throws InterruptedException {
		//clicking dropdown for institution type
		Thread.sleep(1000);	
		WebElement intype=driver.findElement(By.xpath("//input[@id='react-select-10-input']"));
		intype.click();
		intype.sendKeys(type);
		intype.sendKeys(Keys.RETURN);
	}
	    public void setinstitutionnames(String Name) throws InterruptedException {
		// TODO Auto-generated method stub
	    Thread.sleep(1000);	
		WebElement inname=driver.findElement(By.xpath("//input[@id='organizationName']"));
		inname.sendKeys(Name);	
	}
	public void setinstitutionemail(String email) throws InterruptedException {
	    Thread.sleep(1000);
	    WebElement inemail=driver.findElement(By.xpath("//input[@placeholder='Institution Email']"));
		inemail.sendKeys(email);	
	}
	public void setinstitutionplace(String place) throws InterruptedException {
	    Thread.sleep(1000);
	    WebElement inplace=driver.findElement(By.xpath("//input[@id='place']"));
		inplace.sendKeys(place);	
	}
	public void setinstitutionstate(String state) throws InterruptedException {
	    Thread.sleep(1000);
	    WebElement instate=driver.findElement(By.xpath("//input[@id='react-select-11-input']"));
		instate.sendKeys(state);
		instate.sendKeys(Keys.RETURN);
	}
	public void setinstitutiondistrict(String district) throws InterruptedException {
	    Thread.sleep(1000);
	    WebElement indistrict=driver.findElement(By.xpath("//input[@id='react-select-12-input']"));
		indistrict.sendKeys(district);
		indistrict.sendKeys(Keys.RETURN);
	}
	public void submit() throws InterruptedException {
	Thread.sleep(1000);	
	WebElement insubmit=driver.findElement(By.xpath("/html/body/div/div/div[8]/div/div/div[2]/div[3]/div[2]/button[1]"));	
	insubmit.click();	
	}
}
