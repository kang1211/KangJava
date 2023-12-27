package poly;

import inherit_test.house;

public class fan extends house{

	public int sn=1234;
	public static int makedate = 20231227; 
	
	fan(){}
	fan(String brand){
		super(brand);
	}
	
	@Override
	public void power(){
		onoff = !onoff;
	}
}
