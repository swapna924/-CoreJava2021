package Pack3;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		 t.start();
	System.out.println("main thread");
	System.out.println("The 20 even numbers are: ");
	for(int i=1;i<=40;i++) {
		if(i%2==0) {
			
			System.out.println(i);
			System.out.println();
			
		}
	}
	Thread.sleep(1000);	
	Thread.yield();
}
		 
		
	
	}

	

