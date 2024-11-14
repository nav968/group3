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
		
}


