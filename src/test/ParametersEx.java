package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
	
	
	@Test
	@Parameters({"nameparam"})
	public void testcase1(String name) {
		
		System.out.println("hi : " +name);
	}

}
