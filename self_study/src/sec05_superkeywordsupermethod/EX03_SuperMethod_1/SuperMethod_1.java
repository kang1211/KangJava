package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
	A(){
		System.out.println("A 持失切");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B 持失切");
	}
}
class C {
	C(int a){
		System.out.println("C 持失切");
	}
}
class D extends C{
	D(){
		super(3);
	}
}
public class SuperMethod_1 {
	public static void main(String[] args) {
//		A aa = new A();
		System.out.println();
		
		B bb = new B();
		
		D dd = new D();
	}

}
