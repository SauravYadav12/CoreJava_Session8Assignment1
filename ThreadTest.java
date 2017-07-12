
class ThreadDemo implements Runnable {

	// TODO : Implplement run method to print the time our method
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
	
		ThreadDemo t=new ThreadDemo();
			
			t.run();
		}
	
}