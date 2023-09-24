package hiearcharicalinheritance;

public class CallingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mult objMult = new Mult();
		System.out.println("Multiplication of 2 number is: " + objMult.Multiplication(5,3));
		System.out.println("Addition of 2 number is: " + objMult.Addition(5,3));
		
		Subt objSubt = new Subt();
		System.out.println("Subtraction of 2 number is: " + objSubt.Subtraction(5,3));
		
		Div objdiv = new Div();
		System.out.println("Divsion of 2 number is: " + objdiv.Division(5,3));
	
	}
}
