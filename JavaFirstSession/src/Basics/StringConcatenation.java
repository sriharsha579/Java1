package Basics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 100;
		
		String x = "Hello";
		String y = "World";
		
		double c = 11.22;
		double d = 10.99;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(c+d);
		
		System.out.println(a);
		
		System.out.println("The Value of a is:" +a);
		System.out.println("The Value of b is:" +b);

	}

}
