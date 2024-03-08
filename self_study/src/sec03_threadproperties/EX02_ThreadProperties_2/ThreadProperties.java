package sec03_threadproperties.EX02_ThreadProperties_2;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i<100000000 ; i++) {}
		System.out.println(getName() + " 우선순위: " +getPriority());
	}
}

public class ThreadProperties {
	public static void main(String[] args) {
		
		System.out.println("코어수 : "+ Runtime.getRuntime().availableProcessors());
		
		for(int i=0; i<3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
		
		for(int i=0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			if(i == 9) thread.setPriority(10);
			thread.start();
		}
	}
	
}
