package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups=("Smoke"))
	public void Demo2()
	{
		System.out.println("hello2");
	}
	
	@Test
	public void Secondtest2()
	{
		System.out.println("bye2");
	}

	
@BeforeMethod
	
	public void methodbefore()
	{
		System.out.println("I am before Method");
	}
}
