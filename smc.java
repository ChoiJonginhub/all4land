import java.util.*;

public class Smc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re;
		Manager2 m = new Manager2();
		do {
			m.start();
			System.out.println("반복하려면 y를 입력하시오.");
			re = sc.next();
		}while(re.equals("y") || re.equals("Y"));
	}
}

class Manager2{
	Scanner sc = new Scanner(System.in);
	int count;
	Student []st;
	void start() {
		getNum();
		getInfo(count);
		printInfo();
	}
	void getNum() {
		print("성적을 입력할 학생 수를 입력하시오. : ");
		count = sc.nextInt();
		st= new Student[count];
	}	
	void getInfo(int n) {
		println("학생 수만큼 이름,국어,영어,수학 점수를 입력하시오.");
		for(int i=0; i<n; i++) {
			String temp[] = sc.next().split(",");
			st[i]=new Student();
			st[i].setInfo(temp);
		}
	}
	void printInfo() {
		println("-학생정보-");
		for(int i=0; i<count; i++) {
			System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %f", st[i].name, st[i].kr, st[i].en, st[i].mt, st[i].sum, st[i].avg);
			println("");
		}
	}
	void println(String s) {
		System.out.println(s);
	}
	void print(String s) {
		System.out.print(s);
	}
}
