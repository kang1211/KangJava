package homework1227;

public class truck extends Rcgame{
	
	public void Car(String truck){
		this.name = "truck";
		this.cc = 12700;
		this.vw = 5500;
		this.color="gray";
		this.maker="현대";	
	}
	
	@Override
	public void cc() {
		System.out.println("truck의 배기량은 12700cc입니다.");
	}
	
	@Override
	public void vw() {
		System.out.println("truck의 중량은 5500kg ");
	};
}
