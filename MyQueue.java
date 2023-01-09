package memory;

public class MyQueue extends Memory{
	public void push(int n) {
		data[count++]=n;
	}
	public void pop() {
		for(int i=0; i<count; i++) {
			data[i]=data[i+1];
		}
		count-=1;
	}
	public void show() {
		for(int i=0; i<5; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
}
