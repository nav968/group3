package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageobjects.DashboardPage2;
import pageobjects.LoginPage2;

public class DashboardTest2 extends TestBase {
	LoginPage2 LP2;
	DashboardPage2 DBP2;

	@Test
	public void addcontactperson() throws Exception {
		LP2= new LoginPage2(driver);
		DBP2 = new DashboardPage2(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LP2.enterusername(prop.getProperty("uname2"));
		LP2.enterpassword(prop.getProperty("password2"));
		LP2.signinclick();
		DBP2.addNewVisit();
		DBP2.instiDropDown(prop.getProperty("options"));
		DBP2.addContactPerson();
		DBP2.nameField("JOSE DOEEEzy");
		DBP2.designation(prop.getProperty("designation"));
		DBP2.email("jose23@gmail.com");
		DBP2.phone(prop.getProperty("number"));
		DBP2.submitbutton();
		DBP2.contactPersonclose();
	DBP2.addEmp("Associate 2");
		DBP2.addDate("15-11-2024 14:50");
		DBP2.purpose("Test");
		DBP2.contact("Amal (lecture)");
		DBP2.addNote("testing");
		DBP2.submit();
		DBP2.closeAddvisit();
		}
}
