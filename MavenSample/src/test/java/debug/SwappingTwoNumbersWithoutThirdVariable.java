package debug;

public class SwappingTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a= 5;
		int b = 7;
		
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Swapping a and b");
		System.out.println("value of a =" +a);
		System.out.println("value of b=" +b);

	}

}
