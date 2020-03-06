package testScriptPackage;

import org.testng.annotations.Test;

import POMpackage.LoginPage;
import genericPackage.BaseTest;

public class TestLoginScript extends BaseTest {
	
	@Test
	public void validLogin()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");
		lp.clickonLoginBTN();
	}
}
