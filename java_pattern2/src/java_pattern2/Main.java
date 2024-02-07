package java_pattern2;

public class Main {
    public static void main(String[] args) {
       

        HairDryer hairDryer = new HairDryer();
        try{
        	con(hairDryer);
        }catch(Exception e) {
        	e.getStackTrace();
        	System.out.println("오류가 있습니다.");
        }

        Cleanner cleanner = new Cleanner();

        Electronic110V cleanner_adpater = new SocketAdapter(cleanner);
        
        //어댑터를 사용한 청소기
        try {
        con(cleanner_adpater);
        }catch(Exception e) {
        	e.getStackTrace();
        	System.out.println("오류가 있습니다.");
        }

        AirConditioner airConditioner = new AirConditioner();

        Electronic110V airConditioner_Adpater = new SocketAdapter(airConditioner);
        
        //어댑터를 사용한 에어컨
        try {
        con(airConditioner_Adpater);
    	}catch(Exception e) {
    	e.getStackTrace();
    	System.out.println("오류가 있습니다.");
    }

    }


    public static void con(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}