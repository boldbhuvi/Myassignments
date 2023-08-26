package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeaddynamic extends BaseClass{

	@Test (dataProvider="fetchData")//acting as main method for the execution
	public void runCreate(String cname,String fname,String lname) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
}
	
	//@DataProvider -->supply the test data to the @Test
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
			String[][] readExcel = ReadExcel.readExcel();
			return readExcel;
	
		
	}
		
}






