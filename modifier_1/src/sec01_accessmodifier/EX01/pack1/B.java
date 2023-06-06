package sec01_accessmodifier.EX01.pack1;

public class B {
	public void print() {
		A a=new A();//객체생성 가능
		
		System.out.print(a.a+ " ");
		System.out.print(a.b+ " ");
		System.out.print(a.c+ " ");
		// System.out.print(a.d); 불가능
		System.out.println();
		}
	
}
