package memory;

public class MyStack extends Memory {
	public void pop() {
		if(count-1<0) {
			System.out.println("Underflow!");
		}else {
			count--;
			data[count]=0;			
		}
	}
	public void show() {
		for(int i=0; i<5; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
}
