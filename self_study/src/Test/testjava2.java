package Test;
class A{
	int a = 3;
	void abc() {
		int b=1;
		class B{
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a=7;
				System.out.println(a);
			}
		}
		System.out.println("A클래스 abc()메서드");
		B bb = new B();
		bb.bcd();
	}
}
public class testjava2 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
