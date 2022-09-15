package Day5set1;

public class thread_example1 implements Runnable {
   public void run() {
   }
   public static void main(String[] args) {
	   Thread thread1=new Thread();
	   thread1.setPriority(1);
	   thread1.start();
	   try {
		   thread1.sleep(1000);
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   
	   int priority=thread1.getPriority();
	   System.out.println(priority);
	   System.out.println("Thread Running");
   }
}
