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
	//get current url
	public String getdashboardpageurl() throws Exception {
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		return url;
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
			public void addEmp(String employee) throws InterruptedException {
				Thread.sleep(1000);
				WebElement emp = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-9-input']"));
			emp.click();
				emp.sendKeys(employee);
				emp.sendKeys(Keys.RETURN);
			}
			
			public void addDate(String date) throws InterruptedException {	
				//System.out.println("done...");
				Thread.sleep(1000); 
				WebElement da=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[4]/div/input"));
				//WebElement da=driver.findElement(By.xpath("//input[@type='datetime-local']//input[@value='2024-12-26T20:05']"));
			da.click();
			
			da.sendKeys(date);	
				//Select dropdown=new Select(da);
				//dropdown.selectByVisibleText("15-11-2024 50:00");
				//da.sendKeys(date);	
				da.sendKeys(Keys.RETURN);
			}
			public void purpose(String purpose) throws InterruptedException {
				Thread.sleep(1000);
				WebElement dat=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[5]/div/input"));
				//WebElement dat=driver.findElement(By.xpath("//input[@id='purpose']//input[@value='quality check']"));
				dat.click();
				
				dat.sendKeys(purpose);
			}
			public void contact(String person) throws InterruptedException {
				Thread.sleep(1000);
				WebElement cont = driver.findElement(By.xpath("//div[@class=' css-19bb58m']//input[@id='react-select-10-input']"));
			cont.click();
				cont.sendKeys(person);
				cont.sendKeys(Keys.RETURN);	
			}
			public void addNote(String notes) throws InterruptedException {
				Thread.sleep(1000);
				WebElement note=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[7]/div/input"));
				//WebElement note = driver.findElement(By.xpath("//input[@id='additionalNotes']//input[@placeholder='Adding Note']"));
			note.click();
				note.sendKeys(notes);	
			}
			public void submit() throws InterruptedException {
				Thread.sleep(1000);
				WebElement adc=driver.findElement(By.xpath("/html/body/div/div/div/main/div[4]/div/div/div[11]/button[1]"));
				adc.click();
				
			}
			public void contactPersonclose() throws InterruptedException
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//h3[text()=\"Updated Successfully\"]//parent::div//button")).click();
			}
			
}


