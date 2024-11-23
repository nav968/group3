package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisitLogsPage {

	WebDriver driver;
	public VisitLogsPage(WebDriver driver) {
		this.driver = driver;
	}
	// CLICK VISITLOGS
	public void visitlog() throws Exception {
		Thread.sleep(1000);
		WebElement visit = driver.findElement(By.xpath("//span[text()='Visit logs']"));
		visit.click();
	}
	// followup button
	public void followup() throws Exception {
		Thread.sleep(1000);
		WebElement follow = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/table/tbody/tr[1]/td[8]/button[4]/div/div/div"));
		follow.click();
	}

	// action details
	public void actiondetail() throws Exception {
		Thread.sleep(1000);
		WebElement actiondet = driver.findElement(By.xpath("//input[@id='actionDetails']"));
		actiondet.sendKeys("pop");
	}
	//ACTION DESCRIPTION
	public void actiondescription() {
		WebElement actiondes = driver.findElement(By.xpath("//input[@id='actionDescription']"));
		actiondes.sendKeys("pes");
		}
	//action due date
	public void actiondate() {
		WebElement actionduedate = driver.findElement(By.xpath("//input[@id='actionDueDate']"));
		actionduedate.sendKeys("24112024");
	}
	//STATUS DROPDOWN
	public void statusdropdown(String optiontext) throws Exception {
		WebElement status = driver.findElement(By.xpath("//input[@id='react-select-6-input']"));
		status.click();
		status.sendKeys(optiontext);
		Thread.sleep(1000);
		status.sendKeys(Keys.RETURN);
		}
	//submit button
	public void submitfollowup() throws Exception {
		Thread.sleep(1000);
		WebElement submitfu = driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div[2]/div[3]/div[2]/button[1]"));
		submitfu.click();
		}
	//cancel button
	public void cancelbutton() throws Exception {
		Thread.sleep(1000);
		WebElement cancel = driver.findElement(By.xpath("/html/body/div[1]/div/div[8]/div/div/div[2]/div[3]/div[2]/button[2]"));
		cancel.click();
	}
	





}
