package com.wildriver.testcases.Admin.LoginPage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.pageobjects.Admin.LoginPage.LoginPage;

public class AdminLogin extends SuperTestNG
{
	@Test(groups="Admin")
	public static void WR_AdminLogin()
	{
		String xlpath ="./src/com/wildriver/testdata/Admin/LoginPage/Admin Login Credentials.xls";
		String sheetName ="Admin Login Credentials";
		ProjectLibrary.GoToURL_DD(xlpath, sheetName, 1, 1);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Email", LoginPage.txtbx_Email());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Password", LoginPage.txtbx_Password());
		ProjectLibrary.ClickOnButton("Login", LoginPage.btn_Login());
		if (AdminGeneralElements.btn_Logout().isDisplayed())
		{
			Reporter.log("Admin Section Login Successful",true);
		}
	}
}