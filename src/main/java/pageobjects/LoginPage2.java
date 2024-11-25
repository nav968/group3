package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {
	WebDriver driver;
//	public LoginPage2(WebDriver driver2) {
//		// TODO Auto-generated constructor stub
//		this.driver=driver2;
//	}
	public LoginPage2(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public void enterusername(String username) {
		
		WebElement uname=driver.findElement(By.xpath("//input[@type='text']"));	
		uname.sendKeys(username);	
				}	
			
		public void enterpassword(String password) {	

		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));	
		pass.sendKeys(password);
		}

		public void signinclick() {
			
		WebElement signin=driver.findElement(By.xpath("//button[@class='bg-[#32b1dc] w-2/3 rounded-xl hover:bg-[#11a5d7] active:opacity-70 text-white font-bold py-2 px-4 mt-10 h-14 text-[20px] cursor-pointer']"));	
		signin.click();	
		}

		public void verifyelement() throws Exception{
			Thread.sleep(1000);
			boolean isDisplayed=driver.findElement(By.xpath("//img[@src='/static/media/ict-logo.4de4f57ea9e349311e5850a3bbd73c0b.svg']")).isDisplayed();
			
			if (isDisplayed) {
				System.out.println("ICT logo is displayed.");
				
			} else {
		        System.out.println("ICT logo is not displayed");
			}
			
			boolean isEnabled=driver.findElement(By.xpath("//p[@class='text-[15px] text-[#32b1dc] hover:opacity-65 active:underline']")).isEnabled();
			if (isEnabled) {
			    System.out.println("Forgotpassword link is Enabled");
			
			} else {
		       System.out.println("Forgotpassword link is not Enabled");
			}
}
}
