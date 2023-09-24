package polymorphism;

public class ChildClass extends ParentClass{
	
	@Override
	public void printName() {
		System.out.println("Ravi");
	}
	
	
	//method overloading in polymorphism. It doesn't require parent class
	public void printName(String val) {
		System.out.println("My Name is " + val);
	}
	
	public static void main(String[] args) {
		ChildClass objChild = new ChildClass();
		objChild.printName();
		objChild.printName("Virat");
	}
}
