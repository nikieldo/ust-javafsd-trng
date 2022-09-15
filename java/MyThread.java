package Day5set1;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
		public void run() {
			System.out.println("My Thread-START" +Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				doDBProcessing();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("My Thread-END" +Thread.currentThread().getName());
			
			}
		private void doDBProcessing() throws InterruptedException {
			Thread.sleep(5000);
		}
		public static void main(String args[]) {
			MyThread my=new MyThread("nikita");
			my.start();
		}
	}


