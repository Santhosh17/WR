package com.wildriver.testcases.Dealer.MyDetails;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.pageobjects.Dealer.GeneralElements.DealerGeneralElements;
import com.wildriver.pageobjects.Dealer.MyDetails.DealerAccountDetalsPage;
import com.wildriver.testcases.Dealer.LoginPage.DealerLogin;

public class UpdateAccountDetails
{
	@Test(groups ="Dealer")
	public static void WR_UpdateAccountDetails()
	{
		try
		{
			Generic.ImplicitWait(1);
			DealerLogin.WR_DealerLogin();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in So Continuing with Testing Process",true);
			Generic.ImplicitWait(10);
		}
		ProjectLibrary.ClickOnButton("Admin MGR", DealerGeneralElements.btn_MyDetails());
		String xlpath ="./src/com/wildriver/testdata/Dealer/MyDetalis/Account Details.xls";
		String sheetName = "Account Details";
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Postal Address", DealerAccountDetalsPage.txtbx_PostalAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Postal City", DealerAccountDetalsPage.txtbx_PostalCity());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "Postal State", DealerAccountDetalsPage.txtbx_PostalState());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Postal Post Code", DealerAccountDetalsPage.txtbx_PostalPostCode());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 2, 3, "Copy Postal Address to Delvery Address",DealerAccountDetalsPage.chkbx_CopyPostaltoDelivery());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 3, "Delivery Address", DealerAccountDetalsPage.txtbx_DeliveryAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 3, "Delivery City", DealerAccountDetalsPage.txtbx_DeliveryCity());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 3, "Delivery State", DealerAccountDetalsPage.txtbx_DeliveryState());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 3, "Delivery Post Code", DealerAccountDetalsPage.txtbx_DeliveryPostCode());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 5, "Phone", DealerAccountDetalsPage.txtbx_Phone());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 5, "Fax", DealerAccountDetalsPage.txtbx_Fax());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 5, "Email", DealerAccountDetalsPage.txtbx_Email());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 5, "New Password", DealerAccountDetalsPage.txtbx_NewPassword());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 5, "Retype New Password", DealerAccountDetalsPage.txtbx_ReTypeNewPassword());
		ProjectLibrary.ClickOnButton("Update Details", DealerAccountDetalsPage.btn_UpdateDetails());
		ProjectLibrary.SuccessMsgVerify("Dealer details saved successfully.", DealerAccountDetalsPage.txt_ValidationMSG());
	}
}