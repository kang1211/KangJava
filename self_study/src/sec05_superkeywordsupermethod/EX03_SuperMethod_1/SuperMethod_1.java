package sec05_superkeywordsupermethod.EX03_SuperMethod_1;

class A{
	A(){
		System.out.println("A ������");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B ������");
	}
}
class C {
	C(int a){
		System.out.println("C ������");
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
