package pack;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = "SmokeTest")
	public void OrgTest() {
		System.out.println("create org");
		String ur = System.getProperty("url");
		System.out.println(ur);
	}
	
	@Test(groups = "RegressionTest")
	public void ModifyOrgTest() {
		System.out.println("create new org");
	
	}
}
