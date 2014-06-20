package com.wildriver.testcases.Admin.PurchaseOrderMGR.SupplierMGR.SupplierDetails;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.pageobjects.Admin.PurchaseOrderMGR.PurchaseOrderMGRPage;
import com.wildriver.pageobjects.Admin.PurchaseOrderMGR.SupplierMGR.SupplierMGRPage;
import com.wildriver.pageobjects.Admin.PurchaseOrderMGR.SupplierMGR.SupplierDetails.SupplierDetailsPage;
import com.wildriver.testcases.Admin.LoginPage.AdminLogin;

public class UpdateSupplierAndVerify extends SuperTestNG
{
	@Test(groups="Admin",priority = 0)
	public static void WR_UpdateSupplier()
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
		ProjectLibrary.ClickOnButton("P/O MGR", AdminGeneralElements.btn_POMGR());
		ProjectLibrary.ClickOnButton("Manage Suppliers", PurchaseOrderMGRPage.btn_ManageSuppliers());
		String xlpath ="./src/com/wildriver/testdata/Admin/PurchaseOrderMGR/SupplierMGR/SupplierDetails/Supplier.xls";
		String sheetName ="Jack timbers";
		String SupplierName = Generic.getXlCellValue(xlpath, sheetName, 2, 1);
		ProjectLibrary.ClickOnLink("Supplier Name", SupplierMGRPage.lnk_SupplierName(SupplierName));
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 1, 2, "Supplier Code", SupplierDetailsPage.txtbx_SupplierCode());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Supplier Name", SupplierDetailsPage.txtbx_SupplierName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 2, "Supplier Address", SupplierDetailsPage.txtbx_SupplierAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 2, "Supplier Email", SupplierDetailsPage.txtbx_SupplierEmailAddress());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 2, "Supplier Phone Number", SupplierDetailsPage.txtbx_SupplierPhoneNumber());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 2, "Your Supplier Notes", SupplierDetailsPage.txtbx_YourSupplierNotes());
		ProjectLibrary.ClickOnButton("Update Supplier", SupplierDetailsPage.btn_UpdateSupplier());
		ProjectLibrary.SuccessMsgVerify("UPDATED SUPPLIER.", SupplierMGRPage.txt_ValidationMSG());
	}
	@Test(groups="Admin",priority = 1)
	public static void WR_VerifyUpdatedSupplier()
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
		ProjectLibrary.ClickOnButton("P/O MGR", AdminGeneralElements.btn_POMGR());
		ProjectLibrary.ClickOnButton("Manage Suppliers", PurchaseOrderMGRPage.btn_ManageSuppliers());
		String xlpath ="./src/com/wildriver/testdata/Admin/PurchaseOrderMGR/SupplierMGR/SupplierDetails/Supplier.xls";
		String sheetName ="Jack timbers";
		String SupplierNameVerification = Generic.getXlCellValue(xlpath, sheetName, 2, 2);
		ProjectLibrary.ClickOnLink("Supplier Name", SupplierMGRPage.lnk_SupplierName(SupplierNameVerification));
		Reporter.log("**********Data Verifiction**********",true);
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 1, 2, "Supplier Code", SupplierDetailsPage.txtbx_SupplierCode());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 2, 2, "Supplier Name", SupplierDetailsPage.txtbx_SupplierName());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 3, 2, "Supplier Address", SupplierDetailsPage.txtbx_SupplierAddress());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 4, 2, "Supplier Email", SupplierDetailsPage.txtbx_SupplierEmailAddress());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 5, 2, "Supplier Phone Number", SupplierDetailsPage.txtbx_SupplierPhoneNumber());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 6, 2, "Your Supplier Notes", SupplierDetailsPage.txtbx_YourSupplierNotes());
	}
}