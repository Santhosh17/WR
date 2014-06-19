package com.wildriver.testcases.Admin.StockMGR.ProductEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wildriver.libraries.Generic;
import com.wildriver.libraries.ProjectLibrary;
import com.wildriver.libraries.SuperTestNG;
import com.wildriver.pageobjects.Admin.GeneralElements.AdminGeneralElements;
import com.wildriver.pageobjects.Admin.StockMGR.StockMGRPage;
import com.wildriver.pageobjects.Admin.StockMGR.ProductEditor.ProductEditorPage;
import com.wildriver.testcases.Admin.LoginPage.AdminLogin;

public class AddProduct extends SuperTestNG
{
	@Test(groups="Admin")
	public static void WR_AddProduct()
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
		ProjectLibrary.ClickOnButton("Stock MGR",AdminGeneralElements.btn_StockMGR());
		ProjectLibrary.ClickOnButton("Add A New Product", StockMGRPage.btn_AddANewProduct());
		String xlpath = "./src/com/wildriver/testdata/Admin/StockMGR/ProductEditor/Products.xls";
		String sheetName = "Add Product";
		Reporter.log("----------Stock Details----------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Category", ProductEditorPage.txtbx_Category());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Product Group", ProductEditorPage.txtbx_ProductGroup());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 1, "Stock Code", ProductEditorPage.txtbx_StockCode());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 1, "Product Name", ProductEditorPage.txtbx_ProductName());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 6, 1, "Product Color", ProductEditorPage.txtbx_ProductColor());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Grade", ProductEditorPage.txtbx_Grade());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 1, "Fill", ProductEditorPage.txtbx_Fill());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 1, "Pack Weight", ProductEditorPage.txtbx_PackWeight());
		Reporter.log("----------Stock Controls----------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 3, "Minimum Stock Level", ProductEditorPage.txtbx_MinimumStockLevel());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 3, "Quantity Per pallet", ProductEditorPage.txtbx_QuantityPerPallet());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 4, 3, "Unit Of Measure", ProductEditorPage.txtbx_UnitOfMeasure());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 5, 3, "Order Window", ProductEditorPage.txtbx_OrderWindow());
		Reporter.log("----------Current Status----------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 3, "Stock Adjustment - New Stock level", ProductEditorPage.txtbx_StockAdjustmentNewStockLevel());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 9, 3, "Adjustment Reason", ProductEditorPage.txtbx_AdjustmentReason());
		Reporter.log("----------Supplier Details----------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 5, "Supplier Name", ProductEditorPage.txtbx_SupplierName());
		String SupplierName = Generic.getXlCellValue(xlpath, sheetName, 2, 5);
		driver.findElement(By.linkText(SupplierName)).click();
		String Supplier = "./src/com/wildriver/testdata/Admin/PurchaseOrderMGR/SupplierMGR/SupplierDetails/Supplier.xls";
		String AddSupplier = SupplierName;
		Generic.BlindWait(1);
		ProjectLibrary.ClickOn(ProductEditorPage.txtbx_SupplierCode());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 1, 1, "Supplier Code", ProductEditorPage.txtbx_SupplierCode());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 3, 1, "Supplier Address", ProductEditorPage.txtbx_SupplierAddress());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 4, 1, "Email Address", ProductEditorPage.txtbx_SupplierEmail());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 5, 1, "Phone Number", ProductEditorPage.txtbx_SupplierPhoneNumber());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 6, 1, "Your Supplier Notes", ProductEditorPage.txtbx_SupplierNotes());
		ProjectLibrary.ClickOnButton("Add Product", ProductEditorPage.btn_AddProduct());
		ProjectLibrary.SuccessMsgVerify("PRODUCT DETAILS ADDED SUCCESSFULLY.", StockMGRPage.txt_ValidationMsg());
		
		Reporter.log("**********Data Verifiction**********",true);
		
		String ProductCredential = Generic.getXlCellValue(xlpath, sheetName, 5, 1);
		ProjectLibrary.ClickOnLink("Product Name", StockMGRPage.lnk_ProductName(ProductCredential));
		Reporter.log("----------Stock Details Verificaton ----------",true);
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 2, 1, "Category", ProductEditorPage.txtbx_Category());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 3, 1, "Product Group", ProductEditorPage.txtbx_ProductGroup());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 4, 1, "Stock Code", ProductEditorPage.txtbx_StockCode());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 5, 1, "Product Name", ProductEditorPage.txtbx_ProductName());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 6, 1, "Product Color", ProductEditorPage.txtbx_ProductColor());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 7, 1, "Grade", ProductEditorPage.txtbx_Grade());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 8, 1, "Fill", ProductEditorPage.txtbx_Fill());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 9, 1, "Pack Weight", ProductEditorPage.txtbx_PackWeight());
		Reporter.log("----------Stock Controls Verificaton ----------",true);
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 2, 3, "Minimum Stock Level", ProductEditorPage.txtbx_MinimumStockLevel());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 3, 3, "Quantity Per pallet", ProductEditorPage.txtbx_QuantityPerPallet());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 4, 3, "Unit Of Measure", ProductEditorPage.txtbx_UnitOfMeasure());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 5, 3, "Order Window", ProductEditorPage.txtbx_OrderWindow());
		Reporter.log("----------Current Status Verificaton----------",true);
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 8, 3, "Stock Adjustment - New Stock level", ProductEditorPage.txtbx_StockAdjustmentNewStockLevel());
//		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 9, 3, "Adjustment Reason", ProductEditorPage.txtbx_AdjustmentReason());
		Reporter.log("----------Supplier Details Verificaton ----------",true);
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 2, 5, "Supplier Name", ProductEditorPage.txtbx_SupplierName());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 1, 1, "Supplier Code", ProductEditorPage.txtbx_SupplierCode());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 3, 1, "Supplier Address", ProductEditorPage.txtbx_SupplierAddress());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 4, 1, "Email Address", ProductEditorPage.txtbx_SupplierEmail());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 5, 1, "Phone Number", ProductEditorPage.txtbx_SupplierPhoneNumber());
		ProjectLibrary.CompareStringTextBox(Supplier, AddSupplier, 6, 1, "Your Supplier Notes", ProductEditorPage.txtbx_SupplierNotes());
	}
}