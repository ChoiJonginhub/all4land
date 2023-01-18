abstract class Handler{
	public String name;
	private Handler next;
	public Handler(String name) {
		this.name=name;
	}
	void setNext(Handler next) {
		this.next=next;
	}
	void handleRequest(int num) {
		if(canHandle(num)) {
			print(num);
			System.out.println();
		}else if(next!=null) {
			next.handleRequest(num);
		}else {
			System.out.println("처리할 수 있는 객체 없음");
		}
	}
	void print(int num) {
		System.out.printf("%d : %s로 처리",num, name);
	}
	public abstract boolean canHandle(int num);
}
class OddHandler extends Handler{
	public OddHandler(String name) {
		super(name);
	}
	public boolean canHandle(int num) {
		return num%2!=0;
	}
}
class EvenHandler extends Handler{
	public EvenHandler(String name) {
		super(name);
	}
	public boolean canHandle(int num) {
		return num%2==0;
	}
}

public class CoREX {
	public static void main(String[] args) {
		Handler odd = new OddHandler("홀수");
		Handler even = new EvenHandler("짝수");
		
		odd.setNext(even);//체인 연결
		for(int i=1; i<=10; i++) {
			odd.handleRequest(i);
		}
	}
}
