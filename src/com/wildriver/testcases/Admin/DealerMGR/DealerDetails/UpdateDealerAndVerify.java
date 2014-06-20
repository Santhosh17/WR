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

public class UpdateDealerAndVerify extends SuperTestNG
{
	@Test (groups = "Admin")
	public static void WR_UpdateDealer()
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
		
		String xlpath = "./src/com/wildriver/testdata/Admin/DealerMGR/DealerDetals/Dealer.xls";
		String sheetName = "Add Dealer";
		
		String PreviousRecord = Generic.getXlCellValue(xlpath, sheetName, 2, 1);
		ProjectLibrary.ClickOnLink(PreviousRecord, DealerMGRPage.lnk_PreviousRecord(PreviousRecord));
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 1, "Company Name", DealerDetailsPage.txtbx_CompanyName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 1, "COMPANY ACN OR ABN", DealerDetailsPage.txtbx_CompanyACNorABN());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 1, "Postal Address", DealerDetailsPage.txtbx_PostalAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 1, "City", DealerDetailsPage.txtbx_City());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, "State", DealerDetailsPage.txtbx_State());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 1, "Post Code", DealerDetailsPage.txtbx_PostCode());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 11, 3, "SELECT IF ADDRESS IS THE SAME AS THE POSTAL ADDRESS", DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery());
		WebElement PostSameDelivery = DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery();
		if (PostSameDelivery.isSelected())
		{
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 13, 1, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 1, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 15, 1, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 16, 1, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		else
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 3, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 3, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 3, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 3, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 5, "Phone", DealerDetailsPage.txtbx_Phone());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 5, "Fax", DealerDetailsPage.txtbx_Fax());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 13, 5, "Email", DealerDetailsPage.txtbx_Email());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 5, "Password", DealerDetailsPage.txtbx_Password());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 5, "Retype Password", DealerDetailsPage.txtbx_ReTypePassword());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 16, 5, "Notes", DealerDetailsPage.txtbx_Notes());
		ProjectLibrary.ClickOnButton("Add Dealer", DealerDetailsPage.btn_AddDealer());
		ProjectLibrary.SuccessMsgVerify("DEALER UPDATED SUCCESSFULLY", DealerMGRPage.txt_ValidationMSG());
	}
	@Test(groups="Admin",priority = 1)
	public static void WR_VerifyUpdatedDealer()
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
		String xlpath = "./src/com/wildriver/testdata/Admin/DealerMGR/DealerDetals/Dealer.xls";
		String sheetName = "Add Dealer";
		String PreviousRecord = Generic.getXlCellValue(xlpath, sheetName, 11, 1);
		ProjectLibrary.ClickOnLink(PreviousRecord, DealerMGRPage.lnk_PreviousRecord(PreviousRecord));
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 11, 1, "Company Name", DealerDetailsPage.txtbx_CompanyName());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 12, 1, "COMPANY ACN OR ABN", DealerDetailsPage.txtbx_CompanyACNorABN());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 13, 1, "Postal Address", DealerDetailsPage.txtbx_PostalAddress());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 1, "City", DealerDetailsPage.txtbx_City());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 15, 1, "State", DealerDetailsPage.txtbx_State());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 16, 1, "Post Code", DealerDetailsPage.txtbx_PostCode());
		ProjectLibrary.CheckBoxSelection(xlpath, sheetName, 11, 3, "SELECT IF ADDRESS IS THE SAME AS THE POSTAL ADDRESS", DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery());
		WebElement PostSameDelivery = DealerDetailsPage.chkbx_AddressCopyFromPostaltoDelivery();
		if (PostSameDelivery.isSelected())
		{
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 13, 1, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 1, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 15, 1, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 16, 1, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		else
		{
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 12, 3, "Delivery Address", DealerDetailsPage.txtbx_DeliveryAddress());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 13, 3, "Delivery City", DealerDetailsPage.txtbx_DeliveryCity());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 14, 3, "Delivery State", DealerDetailsPage.txtbx_DeliveryState());
			ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 15, 3, "Delivery PostCode", DealerDetailsPage.txtbx_DeliveryPostCode());
		}
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 11, 5, "Phone", DealerDetailsPage.txtbx_Phone());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 12, 5, "Fax", DealerDetailsPage.txtbx_Fax());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 13, 5, "Email", DealerDetailsPage.txtbx_Email());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 16, 5, "Notes", DealerDetailsPage.txtbx_Notes());
	}
}