package homework1227;

public class Rcgame {
	
	String name;
	int cc;
	int vw;
	String color;
	String maker;

// 차량선택
	public void select() {
		System.out.println("고르신 차량은 "+name+"입니다.");
		System.out.println("배기량 : "+cc);
		System.out.println("중량 : "+vw);
		System.out.println("색상 : "+color);
		System.out.println("메이커 : "+maker);
		System.out.println("------------------");
	}

// 키보드 조작
	

//
	
	

}
// 자바 상속
// 민수가 레이싱 게임을 만든다.
// 레이싱에 사용할 자동차를 선택하여 키보드로 조작해서 게임을 즐길수 있다. 필요한 클래스들은 다음과 같다.
// - 부모 클래스를 만드세요(Rcgame)
// - 키보드 조작은 드라이브, 브레이크, 핸들조작이 있습니다.
// - 모든 차량은 베기량, 차중량, 색상, 메이커를 가지고 있습니다.
// - sedan은 기어 수동입니다.
// - suv는 이륜 사륜 선택입니다.
// - supercar는 엔진 선택합니다.
// - truck은 바퀴 사이즈 선택합니다.