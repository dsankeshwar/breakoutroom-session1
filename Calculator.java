package Assignments;

import java.util.Scanner;

class CalcLogic {

	public int add(int num01, int num02) {

		int result = num01 + num02;
		return result;
	}
	public int sub(int num03, int num04) {

		int result = num03 - num04;
		return result;
	}

	public int mul(int num05, int num06) {
		
		int result = num05*num06;
		return result;
		
	}
	public float divi(int num07,int num08) {
		
		float result = 0;
		if (num08!=0)
			result = num07/num08;
		else 
			System.out.println("Invalid number: Divisible by Zero");
			
		return result;
	}
	
	public int mod(int num09, int num10) 
	{
		int result = num09%num10;
		return result;
	}
	
	public float pow(int num11, int num12) 
	{
		double result = Math.pow(num11, num12);
		return (float) result;
	}
	public float sqrt(int num13) 
	{
		
		float result = (float) Math.sqrt(num13);
		return result;
	}
	public float cubrt(int num14)
	{
		double result = Math.cbrt(num14);
		return (float) result;
	}
	
	public double fact(int num15)
	{
		int result=1;
		if (num15==0 || num15==1) 
		{
			System.out.println("Factorial of "+num15+ "is :1");	
		}
		for(int i=1;i<=num15;i++)
		{
			result=result*i;
		}
			return result;				
	}
	
	public float log(int num16)
	{
		double result=Math.log(num16);
		return (float) result;
	}
	
	public void display(double result) 
	{
		System.out.println("Result:" + result);
	}
}

public class Calculator {

	public static void main(String[] args) {
	
		CalcLogic calc = new CalcLogic();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Select number(1-10) to perform operations: \n 1. Addition\n 2. Subraction\n 3. Multiplication\n 4. Division\n 5. Remainder\n 6. Power\r\n"
				+ " 7. Square Root\n 8. Cube Root\n 9. Factorial\n 0. Logarithm\n");
		
		char op = scan1.next().charAt(0);
		switch (op) {
		
		case '1': 
			
			System.out.println("Enter the first number:");
			int num01 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num02 = scan1.nextInt();
			calc.display(calc.add(num01, num02));
			break;
		case '2':
			
			System.out.println("Enter the first number:");
			int num03 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num04 = scan1.nextInt();
			calc.display(calc.sub(num03, num04));
			break;
			
		case '3':
			System.out.println("Enter the first number:");
			int num05 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num06 = scan1.nextInt();
			calc.display(calc.mul(num05, num06));
			break;
		case '4':
			System.out.println("Enter the first number:");
			int num07 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num08 = scan1.nextInt();
			calc.display(calc.divi(num07, num08));
			break;
		case '5':
			System.out.println("Enter the first number:");
			int num09 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num10 = scan1.nextInt();
			calc.display(calc.mod(num09, num10));
			break;
		case '6':
			System.out.println("Enter the first number:");
			int num11 = scan1.nextInt();
			System.out.println("Enter the Second number:");
			int num12 = scan1.nextInt();
			calc.display(calc.pow(num11, num12));
			break;
		case '7':
			System.out.println("Enter the number:");
			int num13 = scan1.nextInt();
			calc.display(calc.sqrt(num13));
			break;
		case '8':
			System.out.println("Enter the number:");
			int num14 = scan1.nextInt();
			calc.display(calc.cubrt(num14));
			break;
		case '9':
			System.out.println("Enter the number:");
			int num15 = scan1.nextInt();
			calc.display((float) calc.fact(num15));
			break;
		case '0':
			System.out.println("Enter the number:");
			int num16 = scan1.nextInt();
			calc.display(calc.log(num16));
			break;
		default :
			System.out.println("Invalid selection:");
			return;
		}
					
	}

}
