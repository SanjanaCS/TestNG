package test;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"CreditCard", "Loan"})
	public void method1() {
		System.out.println("method1 case is executed");
	}
	@Test(groups= {"Bank_Saving"})
	public void method2() {
		System.out.println("method2 case is executed");
	}

	@Test(groups= {"Bank_Current"})
	public void method3() {
		System.out.println("method3 case is executed");
	}
	

}
