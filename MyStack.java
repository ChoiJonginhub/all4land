package memory;

public class MyStack extends Memory {
	public void push(int n) {
		data[count++]=n;
	}
	public void pop() {
		count-=1;
		data[count]=0;
	}
	public void show() {
		for(int i=0; i<5; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
}
