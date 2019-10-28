package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;
//import com.beust.jcommander.Parameters;

public class day1 {

	@Test(groups=("Smoke"))
	public void Demo()
	{
		System.out.println("hello");
	}
	@Parameters({"URL"})
	@Test
	public void Secondtest(String s)
	{
		System.out.println("bye");
                 System.out.println("hiii");
		System.out.println("heeeee");
		System.out.println(s);

	}
	
}
