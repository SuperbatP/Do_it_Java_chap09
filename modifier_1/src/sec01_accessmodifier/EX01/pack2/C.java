package sec01_accessmodifier.EX01.pack2;

import sec01_accessmodifier.EX01.pack1.A;

public class C {
	public void print() {
		A a=new A();//객체생성 가능 import가 있거나, 없으면 ctrl+chift+o
		
		System.out.print(a.a+ " ");
		//System.out.print(a.b+ " ");
		//System.out.print(a.c+ " ");
		// System.out.print(a.d+ " "); 불가능
		System.out.println();
		}
}
