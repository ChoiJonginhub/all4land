class ATM implements Runnable{
	private long depositeMoney = 10000;
	public void run() {
		synchronized(this) {
			for(int i=0; i<10; i++) {
				notify();
				try {
					wait();
				}catch(InterruptedException e) {
				}
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				withDraw(1000);
				if(getDepositeMoney() <=0) {
					notifyAll();
					break;
				}
			}
		}
	}
	public void withDraw(long howmuch) {
		if(getDepositeMoney()>0) {
			depositeMoney -= howmuch;
			System.out.print(Thread.currentThread().getName()+",");
			System.out.printf("money : %,d %n", getDepositeMoney());
			
		} else {
			System.out.print(Thread.currentThread().getName()+",");
			System.out.println("out.");
		}
	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}

public class SynchronizedEx {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
	}
}
