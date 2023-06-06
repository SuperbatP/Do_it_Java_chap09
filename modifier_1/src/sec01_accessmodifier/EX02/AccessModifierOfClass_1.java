package sec01_accessmodifier.EX02;

public class AccessModifierOfClass_1 {
public static void main(String[] args) {
	//객체생성 가능여부 
	A a=new A(); //객체생성가능(A a)+생성자 호출 가능(new A())
	B b=new B(); //객체생성가능(B b)+생성자 호출 가능(new B())
	C c=new C(); //객체생성가능(C c)+생성자 호출 가능(new C())
	//다 같은 패키지에 있어서 public/default 둘 다 가능
}
}
