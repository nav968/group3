package testcases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageobjects.DashboardPage1;
import pageobjects.LoginPage1;

public class DashboardTest1 extends TestBase {
	LoginPage1 LP1;
	DashboardPage1 DBP1;

	@Test
	public void addcontactperson() throws Exception {
		LP1= new LoginPage1(driver);
		DBP1 = new DashboardPage1(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LP1.enterusername(prop.getProperty("uname1"));
		LP1.enterpassword(prop.getProperty("password1"));
		LP1.signinclick();
		DBP1.addNewVisit();
		DBP1.instiDropDown(prop.getProperty("options"));
		DBP1.addContactPerson();
		DBP1.nameField("PETER DOEEEzy");
		DBP1.designation(prop.getProperty("designation"));
		DBP1.email("peter123@gmail.com");
		DBP1.phone(prop.getProperty("number"));
		DBP1.submitbutton();
		DBP1.contactPersonclose();
	DBP1.addEmp("Associate 1");
		DBP1.addDate("15-11-2024 14:50");
		DBP1.purpose("Test");
		DBP1.contact("Amal (lecture)");
		DBP1.addNote("testing");
		DBP1.submit();
		DBP1.closeAddvisit();
		}
}
