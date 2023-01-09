package memory;

import java.util.Scanner;

public class Bind2 { //동적바인딩
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyQueue mq = new MyQueue();
		MyStack ms = new MyStack();
		Memory mm;
		String a="", m="";
		do {
			m="y";
			System.out.println("Stack, Queue?");
			String typeSelect = sc.next();
			while(m.equals("y")) {
				System.out.println("Push, pop?");
				String inoutSelect = sc.next();
				switch(inoutSelect) {
				case "push":
					System.out.println("숫자 입력");
					int num = sc.nextInt();
					if(typeSelect.equals("s")) {
						mm=ms;
						mm.push(num);
					}else if(typeSelect.equals("q")){
						mm=mq;
						mm.push(num);
					}
					break;
				case "pop":
					if(typeSelect.equals("s")) {
						mm=ms;
						mm.pop();
					}else if(typeSelect.equals("q")){
						mm=mq;
						mm.pop();
					}
					break;
				}
				mm=ms;
				mm.show();
				mm=mq;
				mm.show();
				System.out.println("push, pop을 계속 하시겠습니까?");
				m=sc.next();
			}
			System.out.println("타입을 변경해 계속하시겠습니까?");
			a=sc.next();
		}while(a.equals("y"));
	}
}
