package practice;

import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class DataProviderPracticeClass {

	@DataProvider(name = "data1")
	public Object[][] getData()
	{
		HashMap<String, String> m1=new HashMap<String, String>();
		m1.put("username", "admin");
		m1.put("password", "admin");
		m1.put("url", "http://localhost:8888");
		
		HashMap<String, String> m2=new HashMap<String, String>();
		m2.put("username", "admin123");
		m2.put("password", "admin123");
		m2.put("url", "http://localhost:8080");
		
		Object [][] obj = {{m1},{m2}};
		return obj;
	}
	
}
