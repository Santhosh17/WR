package com.wildriver.testcases.Admin.AdminMGR;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.AdminMGR.AdminMGRPage;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.testcases.Admin.LoginPage.AdminLogin;

public class UpdateUser extends SuperTestNG
{
	@Test(groups="Admin")
	public static void WR_UpdateUser()
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
		String sheetName = "Add New User";
		String UserName = Generic.getXlCellValue(xlpath, sheetName, 1, 1);
		ProjectLibrary.ClickOnLink("User Name", AdminMGRPage.lnk_User(UserName));
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 1, 3, "Name", AdminMGRPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 3, "Email", AdminMGRPage.txtbx_EmailAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 3, "Password", AdminMGRPage.txtbx_PasswordDuringUpdate());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 3, "Password Again", AdminMGRPage.txtbx_PasswordAgainDuringUpdate());
		String FullUsage = Generic.getXlCellValue(xlpath, sheetName, 5, 3);
		if (FullUsage.equals("YES"))
		{
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 5, 3, "Full Usage", AdminMGRPage.chkbx_FullUsage());
		}
		else if (FullUsage.equals("NO"))
		{
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 6, 3, "Dealer Manager", AdminMGRPage.chkbx_DealerManager());
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 7, 3, "P/O Manager", AdminMGRPage.chkbx_POManager());
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 8, 3, "Stock Manager", AdminMGRPage.chkbx_StockManager());
			ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 9, 3, "Admin Rights", AdminMGRPage.chkbx_AdminRights());
		}
		ProjectLibrary.ClickOnButton("Add User", AdminMGRPage.btn_AddUser());
		ProjectLibrary.SuccessMsgVerify("ADMIN USER UPDATED SUCCESSFULLY.", AdminMGRPage.txt_ValidationMSG());
		
		Reporter.log("**********Data Verifiction**********",true);
		
		String UpdatedUserName = Generic.getXlCellValue(xlpath, sheetName, 1, 3);
		ProjectLibrary.ClickOnLink("User Name", AdminMGRPage.lnk_User(UpdatedUserName));
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 1, 3, "Name", AdminMGRPage.txtbx_Name());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 2, 3, "Email", AdminMGRPage.txtbx_EmailAddress());
	}
}
