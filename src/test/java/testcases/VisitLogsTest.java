package testcases;

import org.testng.annotations.Test;

import pageobjects.VisitLogsPage;

public class VisitLogsTest extends TestBase {
	
	VisitLogsPage VL;
	@Test
	public void setinstitutionsubmit() throws InterruptedException {
		
		VL=new VisitLogsPage(driver);
		VL.enterUsername(prop.getProperty("uname"));
		VL.enterPassword(prop.getProperty("password"));
		VL.signinClick();
		VL.visitLogs();
		VL.addinstitutions();
		VL.setinstitutiontypes(prop.getProperty("type"));
		VL.setinstitutionnames(prop.getProperty("Name"));
		VL.setinstitutionemail(prop.getProperty("email"));
		VL.setinstitutionplace(prop.getProperty("place"));
		VL.setinstitutionstate(prop.getProperty("state"));
		VL.setinstitutiondistrict(prop.getProperty("district"));
		VL.submit();
	}	
}
