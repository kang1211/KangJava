package homework1227;

public class suv extends Rcgame {
	
	public void Car(String suv){
		this.name = "suv";
		this.cc = 1998;
		this.vw = 1755;
		this.color="blue";
		this.maker="현대";	
	}
	
	@Override
	public void cc(){
		System.out.println("suv의 배기량은 1998cc입니다.");
	}
	@Override
	public void vw() {
		System.out.println("suv의 중량은 1755kg ");
	};
}
