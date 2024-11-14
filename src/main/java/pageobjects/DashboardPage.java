package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) 
	{
		
		this.driver = driver;
	}
	// addnewvisit button click
	
			public void addNewVisit() {
				WebElement visit = driver.findElement(By.xpath("//h1[text()='Add New Visit']"));
				visit.click();
				}
			// clicking the dropdown for adding institution
			
			public void instiDropDown(String optiontext) throws Exception {
				WebElement insti = driver.findElement(By.xpath("//div[@class='basic-single select-op css-b62m3t-container']//input[@id='react-select-8-input']"));
				insti.click();
				insti.sendKeys(optiontext);
				Thread.sleep(1000);
				insti.sendKeys(Keys.RETURN);
				}
			// clicking the add button for contact person
			public void addContactPerson() throws Exception {
				Thread.sleep(1000);
				WebElement addcp = driver.findElement(By.xpath("//button[@class='bg-[#2a6fe7]  hover:bg-[#1563e9] active:bg-[#1563e9] px-2 py-2 rounded-md text-white font-semibold w-[70px]']"));
				addcp.click();
				}
			// clicking on name field
			public void nameField(String Name) throws Exception {
				Thread.sleep(1000);
				WebElement name = driver.findElement(By.id("name"));
				name.sendKeys(Name);
			}
			// clicking desiganation field
			public void designation(String desig) throws Exception {
				Thread.sleep(1000);
				WebElement designate = driver.findElement(By.id("designation"));
				designate.sendKeys(desig);
			}
			 //clicking email id field
			public void email(String mail) throws Exception {
				//Thread.sleep(1000);
				WebElement emailid = driver.findElement(By.xpath("//input[@id='email' and @placeholder ='Email Id']"));
				emailid.sendKeys(mail);
			}
			 //enter phone number 
			public void phone(String phnumber) throws InterruptedException {
				Thread.sleep(1000);
				WebElement ph = driver.findElement(By.xpath("//input[@class='form-control ']"));
				ph.sendKeys(phnumber);
			}
			// click the submit button
			public void submitbutton() throws InterruptedException {
				Thread.sleep(1000);
				WebElement sub = driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[9]/div/div/div[3]/button[1]"));
				sub.click();
			}
			
}


