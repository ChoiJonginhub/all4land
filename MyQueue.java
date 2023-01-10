package memory;

public class MyQueue extends Memory{
	public void pop() {
		if(count-1<0) {
			System.out.println("Underflow!");
		}else {
			for(int i=0; i<count; i++) {
				data[i]=data[i+1];
			}
			data[count]=0;
			count--;			
		}
	}
	public void show() {
		for(int i=0; i<5; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
}
