package dropdown;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JustTest4 {

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test() {
	System.out.println("Just Test 4");
	//ID array
	// String J4[] = null;
	
	//Define the variable as an array.
	
	String J4[] = new String[4];
	J4[0] = "Mohi";
	J4[1] = "Salim";
	J4[2] = "Karim";
	J4[3] = "Motin";
	for(int i = 0; i<4; i++){
		System.out.println("Place " + i +" is " + J4[i]);
	}
	String[][] TwoD = new  String[2][3];
	TwoD[0][0] = "Row 1 Col 1 ";	
	TwoD[0][1] = "Row 1 Col 2 ";	
	TwoD[0][2] = "Row 1 Col 3 ";	
	TwoD[1][0] = "Row 2 Col 1 ";	
	TwoD[1][1] = "Row 2 Col 2 ";	
	TwoD[1][2] = "Row 2 Col 3 ";
	for(int i=0;i<2; i++){
		System.out.println("i is " + i);
		for(int j =0; j<3; j++ ){
			System.out.println("j is " + j);
			
		}
	}
	}
}