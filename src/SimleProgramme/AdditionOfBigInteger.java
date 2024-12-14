package SimleProgramme;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditionOfBigInteger {
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a first Number :- ");
		
		String num1 = sc.nextLine();
		
		System.out.println("Enter a secound Line : - ");
		
		String num2 = sc.nextLine();
		
		
		BigInteger first = new BigInteger(num1);
		
		BigInteger secound= new BigInteger(num2);
		
		System.out.println("Addition of two number is "+first.add(secound));
		
		
		
	}
	
	

}
