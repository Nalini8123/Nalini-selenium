package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript_1 {
	@Test(priority=1)
	public void test1()
		{
			Reporter.log("Hello",true);
		}
	@Test(priority=1)
	public void test2()
		{
			Reporter.log("bye",true);
		}
}

