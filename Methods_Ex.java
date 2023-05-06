
public class Methods_Ex {
	int addOfTwo(int a, int b) {
		return a + b;
	}

	public void subOfTwo(int a, int b) {
		System.out.println("sub of to numbers:" + (a + b));
	}

	public static void mulOfTwo() {
		int a = 12;
		int b = 23;
		System.out.println("mul of to numbers:" + (a * b));
	}

	public static void main(String[] args) {
		Methods_Ex.mulOfTwo();

		Methods_Ex obj = new Methods_Ex();
		System.out.println(obj.addOfTwo(12, 13));
		obj.subOfTwo(200, 22);
	}

}
