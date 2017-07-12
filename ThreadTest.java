
class ThreadDemo implements Runnable {

	// TODO : Implement run method to print the timeout 
	@Override
	public void run(){

		try {
			for(int i=0;i<10;i++){   // Limiting the print to 10 times 
			
			Thread.sleep(1000);		// Print timeout every sec
		
				System.out.println("Timeout"+i);
			}
		}
		 catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}

class ThreadTest {
		public static void main(String[] args) {
	
		ThreadDemo t=new ThreadDemo();  //Creating an object to threadDemo class
			
			t.run();
		}
	
}
