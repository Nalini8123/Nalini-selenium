package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testInvocation {
@Test(invocationCount=1)
public void test1()
{
	Reporter.log("Hello",true);
}
@Test(invocationCount=2)
public void test2()
{
	Reporter.log("Hello",true);
}
}
