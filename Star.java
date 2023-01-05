import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
//		//1번
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//2번
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		//3번
//		int i=2, j=1;
//		while(i>=0) {
//			for(int k=0; k<i; k++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<j; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			i--;
//			j++;
//		}
//		//4번
//		int i=2, j=1;
//		while(i>=0) {
//			for(int k=0; k<i; k++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<j; k++) {
//				System.out.print("*");
//			}
//			i--;
//			j+=2;
//			System.out.println();
//		}
//		//5번
//		int i=2, j=1;
//		while(i>=0) {
//			for(int k=0; k<i; k++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<j; k++) {
//				System.out.print("*");
//			}
//			i--;
//			j+=2;
//			System.out.println();
//		}
//		i=1;
//		j-=4;
//		while(i<=2) {
//			for(int k=0; k<i; k++) {
//				System.out.print(" ");
//			}
//			for(int k=0; k<j; k++) {
//				System.out.print("*");
//			}
//			i++;
//			j-=2;
//			System.out.println();
//		}
		//6번
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = " ";
		if(num%2==1) {
			int cnt=1;
			for(int i=0; i<num; i++) {
				if(i<num/2) {
					for(int j=num/2-i; j>0; j--) {
						System.out.print(" ");
					}
					for(int k=0; k<cnt; k++) {
						System.out.print("*");
					}
					cnt+=2;
				} else {
					for(int j=i-num/2; j>0; j--) {
						System.out.print(" ");
					}
					for(int k=0; k<cnt; k++) {
						System.out.print("*");
					}
					cnt-=2;
				}
				System.out.println();
			}
		}
		else {
			System.out.println("홀수 입력해주세요");
		}
	}
}
