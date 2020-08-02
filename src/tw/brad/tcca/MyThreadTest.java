package tw.brad.tcca;

public class MyThreadTest {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1("A");
		MyThread1 mt2 = new MyThread1("B");
		mt1.start();
		mt2.start();
	}

}

class MyThread1 extends Thread {
	private String name;
	MyThread1(String name){this.name = name;}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
			}
		}
	}
}
