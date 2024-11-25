package testcases;

import org.testng.annotations.Test;

import pageobjects.VisitLogsPage1;

public class VisitLogsTest1 extends TestBase {
	VisitLogsPage1 VL1;
	@Test
	public void setinstitutionsubmit() throws InterruptedException {
		
		VL1=new VisitLogsPage1(driver);
		VL1.enterUsername(prop.getProperty("uname1"));
		VL1.enterPassword(prop.getProperty("password1"));
		VL1.signinClick();
		VL1.visitLogs();
		VL1.addinstitutions();
		VL1.setinstitutiontypes(prop.getProperty("type"));
		VL1.setinstitutionnames(prop.getProperty("Name"));
		VL1.setinstitutionemail(prop.getProperty("email"));
		VL1.setinstitutionplace(prop.getProperty("place"));
		VL1.setinstitutionstate(prop.getProperty("state"));
		VL1.setinstitutiondistrict(prop.getProperty("district"));
		VL1.submit();
	}	
}
