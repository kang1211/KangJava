package homework1227;

public abstract class Rcgame {
	
	String name;
	int cc;
	int vw;
	String color;
	String maker;

// 차량 선택------------------------------------------------
	public abstract void select();
//	차량 특징-----------------------------------------------
	
////	  sedan 
//	  String gear; 
////	  suv
//	  String wd;
////	  supercar
//	  String engine;
////	  truck
//	  String ws;
	  
// 키보드 조작-----------------------------------------------
		int Drive;
		int Handle;
		
		public abstract void speed();
		public abstract void stop();
		public abstract void left();
		public abstract void right();
}
//
	
	
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