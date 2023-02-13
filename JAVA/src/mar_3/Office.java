package mar_3;

public class Office {
	void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	void add2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	void multi(int x, int y) {
		int z = x * y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Office obj = new Office();
//		obj.add();
//		
//		obj.add2(11, 22);
//		obj.add2(999, 999);
//		obj.add2(1000, 1500);
//		obj.add2(1, 888);
//		obj.add2(1, 1);

		Office obj = new Office();
		obj.add2(1, 2);
		obj.multi(2, 3);
		obj.add();
	}

}
