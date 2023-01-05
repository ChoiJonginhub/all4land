package javaex;

public class TimesTable {
	public static void main(String[] args) {
//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.print(j+"*"+i+"="+j*i+"\t");
//			}
//			System.out.println();
//		}
		int i=1, j=2;
		while(i<10) {
			j=2;
			while(j<10) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
