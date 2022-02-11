package operators;

public class operators {
	public static void main(String[] args) {
		//operators helps to perform computation
		//1.ARITHMETIC OPERATORS
		// + - * / %
		double amount = 1200.57;
		double tax = 0.18;
		
		double total = amount + (tax*amount);
		System.out.println("Total is:"+total);
		
		//2.ASSIGNMENT OPERATORS
		// = += -= *= /= %=
		int eWallet =200;
		eWallet +=100;
		System.out.println("eWallet now is:"+eWallet);
		
		eWallet %= 7;
		System.out.println("eWallet is:"+eWallet);
		
		//3.
		
	}

}
