package com.wildriver.testcases.Admin.AdminMGR;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.AdminMGR.AdminMGRPage;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.testcases.Admin.LoginPage.AdminLogin;

public class DeleteUser extends SuperTestNG
{
	@Test(groups="Admin")
	public static void WR_DeleteUser()
	{
		try
		{
			Generic.ImplicitWait(1);
			AdminLogin.WR_AdminLogin();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in So Continuing with Testing Process",true);
			Generic.ImplicitWait(10);
		}
		ProjectLibrary.ClickOnButton("Admin MGR", AdminGeneralElements.btn_AdminMGR());
		String xlpath ="./src/com/wildriver/testdata/Admin/AdminMGR/Users.xls";
		String sheetName = "Delete User";
		String UserName = Generic.getXlCellValue(xlpath, sheetName, 1, 1);
		ProjectLibrary.ClickOnButton("Delete", AdminMGRPage.btn_DeleteUser(UserName));
		Alert alert = driver.switchTo().alert();
		Reporter.log("Switching Control to Alert Popup",true);
		alert.accept();
		Reporter.log("Clicked on OK in Alert Popup",true);
		ProjectLibrary.SuccessMsgVerify("USER DELETED SUCCESSFULLY.", AdminMGRPage.txt_ValidationMSG());
	}
}