package TestNG;

import java.util.Properties;

import org.testng.annotations.Test;

public class property {
@Test
public void test()
{
	Properties p = new Properties();
	p.load(new FileInputStream("./File/p.properties"));
	String url=p.getProperty("URL");
	System.out.println(url);
}
}
