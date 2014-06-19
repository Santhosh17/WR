package com.wildriver.pageobjects.Admin.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wildriver.libraries.SuperTestNG;

public class LoginPage extends SuperTestNG
{
	public static WebElement txtbx_Email()
	{
		WebElement Element = driver.findElement(By.id("UserEmail"));
		return Element;
	}
	public static WebElement txtbx_Password()
	{
		WebElement Element = driver.findElement(By.id("UserPassword"));
		return Element;
	}
	public static WebElement btn_Login()
	{
		WebElement Element = driver.findElement(By.xpath("//input[@value='LOGIN']"));
		return Element;
	}
}
