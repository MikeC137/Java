public class ThreadDemo implements Runnable {
	// This method will be executed by the thread (must override run method of
	// Runnable interface)
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();
	}
}
