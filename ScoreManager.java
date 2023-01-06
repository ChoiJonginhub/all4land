import java.util.Scanner;

public class ScoreManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String re;
		Manager m = new Manager();
		do {
			m.start();
			System.out.println("반복하려면 y를 입력하시오.");
			re = sc.next();
		}while(re.equals("y") || re.equals("Y"));		
	}
}

class Manager {
	//field
	int count, scores[][];
	String names[];
	double avg[];
	Scanner sc = new Scanner(System.in);
	//constructor
	Manager() {
		println("<성적 관리 프로그램>");
	}
	//method
	void start() {
		getNum();
		getInfo(count);
		printInfo();
	}
	void getNum() {
		print("성적을 입력할 학생 수를 입력하시오. : ");
		count = sc.nextInt();
	}
	void getInfo(int n) {
		names = new String[n];
		avg = new double[n];
		scores = new int[n][4];
		println("학생 수만큼 이름,국어,영어,수학 점수를 입력하시오.");
		for(int i=0; i<n; i++) {
			String temp[] = sc.next().split(",");
			names[i]=temp[0];
			for(int j=0; j<3; j++) {
				scores[i][j]=Integer.valueOf(temp[j+1]);
				scores[i][3]+=Integer.valueOf(temp[j+1]);
			}
			avg[i]=(double)scores[i][3]/3;
		}
	}
	void printInfo() {
		println("-학생정보-");
		for(int i=0; i<count; i++) {
			System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %f", names[i], scores[i][0], scores[i][1], scores[i][2], scores[i][3], avg[i]);
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