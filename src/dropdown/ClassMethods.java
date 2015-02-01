package dropdown;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassMethods {

	@Test
	public void test() {
		int a = 12;
		int b = 20;
		System.out.println(" a "+ a );
		System.out.println(" b "+ b );
		
	}
	public int addF(int a1 , int b1){
		System.out.println(" a1 "+ a1 );
		System.out.println(" b1 "+ b1 );
		System.out.println( a1+ b1 );
	
	return a1 + b1;
	}

}
