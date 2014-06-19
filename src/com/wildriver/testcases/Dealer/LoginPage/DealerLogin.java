package com.wildriver.testcases.Dealer.LoginPage;

import org.testng.annotations.Test;

import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.LoginPage.LoginPage;

public class DealerLogin extends SuperTestNG
{
	@Test(groups="Dealer")
	public static void WR_DealerLogin()
	{
		String xlpath ="./src/com/wildriver/testdata/Dealer/LoginPage/Dealer Login Credentials .xls";
		String sheetName ="Dealer Login Credentials";
		ProjectLibrary.GoToURL_DD(xlpath, sheetName, 1, 1);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "Email", LoginPage.txtbx_Email());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Password", LoginPage.txtbx_Password());
		ProjectLibrary.ClickOnButton("Login", LoginPage.btn_Login());
	}
}