package homework1227;

public class supercar extends Rcgame{
	
	String name = "supercar";
	int cc = 5999;
	int vw = 1585;
	String color = "yellow";
	String maker = "페라리";
	
	public void Car(String supercar){
		this.name = "supercar";
		this.cc = 5999;
		this.vw = 1585;
		this.color="yellow";
		this.maker="페라리";	
	}
	
	@Override
	public void cc() {
		System.out.println("supercar의 배기량은 5999cc입니다.");
	}
	
	@Override
	public void vw() {
		System.out.println("supercar의 중량은 1585kg ");
	}
	
}
