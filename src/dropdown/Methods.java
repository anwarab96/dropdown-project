package dropdown;

import static org.junit.Assert.*;

import org.junit.Test;

public class Methods {

	@Test
	public void test() {
		method1();
		System.out.println("Hello Selenium");
		method2("Selenium Tutorial");
		method3("Again i/p");
		method3("Testing Jobs");
	}
	public void method1(){
		//Simple mehtod no input. no o/p
		System.out.println("My method1");
		
	}
	public void method2(String name){
		//Simple method 1 i/p. 1 o/p
		System.out.println("My method2 has got a input called " + name);
		
	}
	public String method3(String email)
	{
		//Simple method 1 input. 1o/p
		System.out.println("My method3 has got input called  "+ email);
		return "Test is a pass";
	}

}
