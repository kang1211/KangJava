package sec02_createandstartthread.EX02_CreateAndStartThread_M1C2;

class SMIFileThread extends Thread{
	
	@Override
	public void run() {
		String[] strArray = {"하나","둘","셋","넷","다섯"};
		try{
			Thread.sleep(20);
		}catch(Exception e) {}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(" - (자막 번호) " + strArray[i]);
			try {Thread.sleep(200);}catch(Exception e) {}
		}
	}
}

class VideoFileThread extends Thread{
	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};
		
		for(int i =0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {Thread.sleep(200);}catch(Exception e) {}
		}
	}
}

public class CreateAndStartThread_M1C1{
	public static void main(String[] args) {
		
		Thread smiFileThread = new SMIFileThread();
		smiFileThread.start();
		
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.start();
		
	}
}