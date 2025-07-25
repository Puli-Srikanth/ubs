package packag;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "RegressionTest")
	public void CreateContact() {
		System.out.println("Contact org");
	}
	
	@Test(groups = "SmokeTest")
	public void ModifyContact() {
		System.out.println("create ModifyContact");
	}
}
