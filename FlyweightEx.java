import java.util.HashMap;
import java.util.Scanner;

class Tree{
	private String color;
	private int x,y;
	
	public Tree(String color) {
		this.color=color;
	}
	void setX(int x) {
		this.x=x;
	}
	void setY(int y) {
		this.y=y;
	}
	void install() {
		System.out.printf("x: %d, y: %d 위치에 %s색 나무를 설치함.", x,y,color);
		System.out.println();
	}
}
class TreeFactory{
	public static final HashMap<String, Tree> treemap = new HashMap<>();
	
	public static Tree getTree(String treeColor) {
		Tree t = (Tree)treemap.get(treeColor);
		if(t==null) {
			t = new Tree(treeColor);
			treemap.put(treeColor, t);
			System.out.println("새 나무 객체 생성");
		}
		return t;
	}
}
public class FlyweightEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 색을 입력하세요 :");
		for(int i=0; i<5; i++) {
			String input = sc.nextLine();
			Tree t = (Tree)TreeFactory.getTree(input);
			t.setX((int)(Math.random()*100));
			t.setY((int)(Math.random()*100));
			t.install();
		}
	}

}
