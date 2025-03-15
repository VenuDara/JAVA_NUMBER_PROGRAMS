package NumberPrograms;

public class MethodOverloading {

	void add() {
		System.out.println("Add method");
		
	}
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.add();
		mo.add(10, 20);
		mo.add(10, 40);
	}

}