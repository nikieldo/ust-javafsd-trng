package Day5set1;
import java.lang.*;
public class ThreadDemo implements Runnable {
	Thread t;
	ThreadDemo(String str) {
		t=new Thread(this,str);
		t.start();
	}
   public void run() {
	   for(int i=0;i&amp;amp;amp;amp;amp;It;5;i++) {
		   if((i%5)==0) {
			   System.out.println(Thread.currentThread().getName()+"Yielding control...");
			   Thread.yield();
		   }
	   }
	   System.out.println(Thread.currentThread().getName()+"has finished executing");
   }
   public static void main(String[] args) {
	   new ThreadDemo("Thread 1");
	   new ThreadDemo("Thread 2");
	   new ThreadDemo("Thread 3");
   }
}
