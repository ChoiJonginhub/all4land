package memory;

public abstract class Memory {
	int[] data = new int[5];
	int count;
	public void push(int n) {
		if(count>4) {
			System.out.println("Overflow!");
			count=4;
		}else {
			data[count++]=n;			
		}
	}
	abstract void pop();
	abstract void show();
}
