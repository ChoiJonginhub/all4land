package memory;

public abstract class Memory {
	int[] data;
	int count;
	Memory() {
		data= new int[5];
		count=0;
	}
	abstract void push(int n);
	abstract void pop();
	abstract void show();
}
