package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class D extends A {//D 클래스는 A 클래스의 자식 클래스이다.
	public void print() {
		//객체 생성 불필요. 상속하면 객체까지 상속됨
		System.out.print(a+ " ");
		System.out.print(b+ " ");
		//System.out.print(c+ " "); 불가능
		//System.out.print(d+ " "); 불가능
		System.out.println();
		}
}
