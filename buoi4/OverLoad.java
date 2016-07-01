package buoi4;

public class OverLoad {
	void sum (int a, int b) {
		System.out.println(a+b);
	}
	void sum (int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		OverLoad obj = new OverLoad();
		obj.sum(4, 5);
		obj.sum(4, 5, 6);

	}

}
