package homework1227;

public class sedan extends Rcgame {
	
	String name = "sedan";
	int cc = 1368;
	int vw = 965;
	String color = "red";
	String maker = "현대";
	
//	public void Car(String sedan){
//		this.name = "sedan";
//		this.cc = 1368;
//		this.vw = 965;
//		this.color="red";
//		this.maker="현대";	
//	}
	
	@Override
	public void cc() {
		System.out.println("sedan의 배기량은 1368cc입니다.");
	}
	
	@Override
	public void vw() {
		System.out.println("sedan의 중량은 965kg ");
	};
}
