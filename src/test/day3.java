package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	@Test(groups=("Smoke"))
	public void demo3()
	{
		System.out.println("hello3");
	}
	
	@Test(dependsOnMethods= {"demo3"})
	public void Pqr()
	{
		System.out.println("pqr");
	}
	
	@Test(dataProvider="getdata")
	public void setdata(String user,String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	}
	@Test
	public void secondtest3() 
	{
		System.out.println("i am fail");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="user1";
		data[0][1]="pass1";
		data[1][0]="user2";
		data[1][1]="pass2";
		return data;
		
	}
	{
		
	}
@BeforeTest
	
	public void prerequist()
	{
		System.out.println("I am before Test");
	}

@AfterTest

public void postrequist()
{
	System.out.println("I amafter Test");
}
}