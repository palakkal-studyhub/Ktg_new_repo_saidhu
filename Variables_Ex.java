
public class Variables_Ex {// ctrl+shift+f
	static int countryCode = 91;
	byte age = 32;// global variable-->instance,static 1byte

	public static void main(String[] args) {

		System.out.println(Variables_Ex.countryCode);

		int marks = 23456;// local variable
		float salary = 23.893471936292f;
		double calci = 23.893471936292;
		boolean result = true;
		char gender = 'M';
		System.out.println("welcome to eclipse" + marks + "  " + salary + " " + calci);

		Variables_Ex wel = new Variables_Ex();
		System.out.println(wel.age);

	}
}
