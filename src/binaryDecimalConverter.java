import java.util.*;
public class binaryDecimalConverter {
	
	
	public static String decimalToBinary(String numStr) {
		long num=Long.valueOf(numStr);
		return decimalToBinaryHelper(num,"");
	
	}
	
	public static String decimalToBinaryHelper(long n,String previous) {
		if(n==0) {
			return previous;
		}else {
			long remainder=n%2;
			long quotient=n/2;
			String result=remainder+previous;
			return decimalToBinaryHelper(quotient,result);
		}
		
	}

	public static long binaryToDecimal(String numStr) {
		long sum=0;
		int exponent;
		int digit=0;
		for(int i=0;i<numStr.length();i++) {
			digit=Integer.parseInt(String.valueOf(numStr.charAt(numStr.length()-1-i)));
			//System.out.println(digit);
			sum+=digit*Math.pow(2,i);
		}
		return sum;
		
	}
	
	
	
	public static void main(String[]args) {
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Type beans for decimal to binary conversion, type whopper for binary to decimal conversion");
		String answer=kb.next();
		
		if(answer.equals("beans")) {
			System.out.println("What number do you wanna convert to binary?");
			String number=kb.next();
			System.out.println("binary value: "+decimalToBinary((number)));
		
		}else if(answer.equals("whopper")) {
			
			System.out.println("What number do you wanna convert to decimal?");
			String number=kb.next();
			System.out.println("Decimal value: "+binaryToDecimal((number)));
			
		}
		
		
		
		
	}
	
	
	
}
