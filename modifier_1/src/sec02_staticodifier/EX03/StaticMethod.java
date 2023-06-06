package sec02_staticodifier.EX03;

class A{
	void abc() {System.out.println("instance 매서드");}
	static void bcd() {System.out.println("static 매서드");}
}
public class StaticMethod {
public static void main(String[] args) {
	//1.인스턴스 매서드 활용-객체 생성후 사용가능
	A a1=new A();
	a1.abc();
	
	//2. 정적 매서드 활용방법-클래스 이름으로 바로 접근하여 사용
	A.bcd();
	//객체 생성 후 에도 사용가능
	A a2=new A();
	a2.bcd();
}
}
