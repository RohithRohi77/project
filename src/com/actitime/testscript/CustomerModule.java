package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException
	{
		Reporter.log("create customer",true);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		t.getEnterCustNameTF().sendKeys("AxisBank_001");
		t.getEnterCustDescriptionTF().sendKeys("banking project");
		t.getSelectCustDropdown().click();
		t.getOurCompany().click();
		t.getCreateCustBtn().click();
		String actualTitle = t.getCreatedCustName().getText();
		String expectedTitle = "AxisBank_001";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
