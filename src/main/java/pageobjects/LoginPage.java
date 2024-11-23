package pageobjects;




	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LoginPage {
		WebDriver driver;
		public LoginPage(WebDriver driver) 
		{
			
			this.driver = driver;
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

