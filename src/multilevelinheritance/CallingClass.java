package multilevelinheritance;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subt objCall = new Subt();
		System.out.println("Multiplication of 2 number is: " + objCall.Multiplication(5,3));
		System.out.println("Addition of 2 number is: " + objCall.Addition(5,3));
		System.out.println("Subtraction of 2 number is: " + objCall.Subtraction(5,3));
	}
}
