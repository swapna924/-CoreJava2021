package Pack3;

public class MyThread implements Runnable{

	public  void run() {
			System.out.println("multiples of 5 are: ");
			  for(int i=1;i<=10;i++) {
				  
			  System.out.println("5"+"*"+i+"="+5*i); 
			  }
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 
			
		
		}

	

}
