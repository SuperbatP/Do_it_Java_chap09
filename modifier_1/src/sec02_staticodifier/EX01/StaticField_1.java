package sec02_staticodifier.EX01;
class A{
	int m=3;//인스턴스 필드
	static int n=5;//static(정적) 필드
}//class A end



public class StaticField_1 {

public static void main(String[] args) {
	//인스턴스 필드 활용-항상 객체 성생 후 사용
	A a1=new A();
	System.out.println(a1.m);
	
	//정적 필드 활용-객체 생성 없이 클래스 이름으로 바로 활용
System.out.println(A.n);

// 인스턴스와 동일하게 객체 생성 후 활용(지양할 것)
A a2=new A();
System.out.println(a2.n);
}

}
