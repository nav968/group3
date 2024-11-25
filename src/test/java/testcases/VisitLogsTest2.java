package testcases;

import org.testng.annotations.Test;

import pageobjects.VisitLogsPage2;

public class VisitLogsTest2 extends TestBase {
	VisitLogsPage2 VL2;
	@Test
	public void setinstitutionsubmit() throws InterruptedException {
		
		VL2=new VisitLogsPage2(driver);
		VL2.enterUsername(prop.getProperty("uname2"));
		VL2.enterPassword(prop.getProperty("password2"));
		VL2.signinClick();
		VL2.visitLogs();
		VL2.addinstitutions();
		VL2.setinstitutiontypes(prop.getProperty("type"));
		VL2.setinstitutionnames(prop.getProperty("Name"));
		VL2.setinstitutionemail(prop.getProperty("email"));
		VL2.setinstitutionplace(prop.getProperty("place"));
		VL2.setinstitutionstate(prop.getProperty("state"));
		VL2.setinstitutiondistrict(prop.getProperty("district"));
		VL2.submit();
	}	
}
