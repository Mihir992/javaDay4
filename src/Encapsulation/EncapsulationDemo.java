package Encapsulation;

public class EncapsulationDemo {
	private String password;
	private String name;
	
	public void setEncapsulationDemo(String passVal, String nameVal) {
		password=passVal;
		name=nameVal;
	}
	
	public String getEncapsulationDemo() {
		return password + " " + name;
		
	}
	
}
