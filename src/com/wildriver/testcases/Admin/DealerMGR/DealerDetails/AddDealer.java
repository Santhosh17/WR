package com.wildriver.testcases.Admin.DealerMGR.DealerDetails;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.DealerMGR.DealerMGRPage;
import com.wildriver.pageobjects.Admin.DealerMGR.DealerDetails.DealerDetailsPage;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.testcases.Admin.LoginPage.AdminLogin;

public class AddDealer extends SuperTestNG
{
	@Test(groups="Admin")
	public static void WR_AddDealer()
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
		ProjectLibrary.ClickOnButton("Dealer MGR", AdminGeneralElements.btn_DealerMGR());
		ProjectLibrary.ClickOnButton("Add A Dealer", DealerMGRPage.btn_AddADealer());
		String xlpath = "./src/com/wildriver/testdata/Admin/DealerMGR/DealerDetals/Dealer.xls";
		String sheetName = "Add Dealer";
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Company Name", DealerDetailsPage.txtbx_CompanyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "COMPANY ACN OR ABN", DealerDetailsPage.txtbx_CompanyACNorABN());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Postal Address", DealerDetailsPage.txtbx_PostalAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "City", DealerDetailsPage.txtbx_City());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "State", DealerDetailsPage.txtbx_State());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Post Code", DealerDetailsPage.txtbx_PostCode());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 2, 3, "SELECT IF ADDRESS IS THE SAME AS THE POSTAL ADDRESS", DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery());
		WebElement PostSameDelivery = DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery();
		if (PostSameDelivery.isSelected())
		{
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 4, 1, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 5, 1, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 6, 1, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 7, 1, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		else
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 3, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 3, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 3, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 3, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 5, "Phone", DealerDetailsPage.txtbx_Phone());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 5, "Fax", DealerDetailsPage.txtbx_Fax());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 5, "Email", DealerDetailsPage.txtbx_Email());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 5, "Password", DealerDetailsPage.txtbx_Password());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 5, "Retype Password", DealerDetailsPage.txtbx_ReTypePassword());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 5, "Notes", DealerDetailsPage.txtbx_Notes());
		ProjectLibrary.ClickOnButton("Add Dealer", DealerDetailsPage.btn_AddDealer());
		ProjectLibrary.SuccessMsgVerify("DEALER HAS BEEN SAVED.", DealerMGRPage.txt_ValidationMSG());
	}
}
