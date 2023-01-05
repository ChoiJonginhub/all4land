package javaex;

import java.util.Scanner;

public class StarMethod {
	public static void main(String[] args) {
		int num;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("1~6번 중 실행할 것을 고르시오.(0 입력시 종료) : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				starOne();
				break;
			case 2:
				starTwo();
				break;
			case 3:
				starThree();
				break;
			case 4:
				starFour();
				break;
			case 5:
				starFive();
				break;
			case 6:
				starSix();
				break;
			case 0:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("1~6번 중에서 골라주세요");
			}
		}while(num!=0);
		
	}
	static void starTwo() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void starOne() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void starThree() {
		int i=2, j=1;
		while(i>=0) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("*");
			}
			System.out.println();
			i--;
			j++;
		}
	}
	static void starFour() {
		int i=2, j=1;
		while(i>=0) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("*");
			}
			i--;
			j+=2;
			System.out.println();
		}
	}
	static void starFive() {
		int i=2, j=1;
		while(i>=0) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("*");
			}
			i--;
			j+=2;
			System.out.println();
		}
		i=1;
		j-=4;
		while(i<=2) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int k=0; k<j; k++) {
				System.out.print("*");
			}
			i++;
			j-=2;
			System.out.println();
		}
	}
	static void starSix() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num%2==1) {
			int center = num/2;
			int empty=center+1, starcnt=(-1);
			for(int i=0; i<num; i++) {
				if(i<=center) {
					empty-=1;
					starcnt+=2;
					System.out.print(" ".repeat(empty));
					System.out.print("*".repeat(starcnt));
				}else {
					empty+=1;
					starcnt-=2;
					System.out.print(" ".repeat(empty));
					System.out.print("*".repeat(starcnt));
				}
				System.out.println();
			}
		}else {
			System.out.println("홀수 입력해주세요");
		}
	}
}
