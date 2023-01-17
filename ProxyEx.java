interface Image{
	void display();
}
class Real_Image implements Image{
	private String name;
	public Real_Image(String name) {
		this.name=name;
		loadFromDisk(name);
	}
	private void loadFromDisk(String name) {
		System.out.println("Loading "+name);
	}
	@Override
	public void display() {
		System.out.println("Displaying "+name);
	}
}
class Proxy_Image implements Image{
	private Real_Image ri;
	private String name;
	public Proxy_Image(String name) {
		this.name=name;
	}
	
	@Override
	public void display() {
		if(ri==null) {
			ri = new Real_Image(name);
		}
		ri.display();
	}
}
public class ProxyEx {

	public static void main(String[] args) {
		Image img1 = new Proxy_Image("test1.png");
		Image img2 = new Proxy_Image("test2.png");
		
		img1.display();
		System.out.println();
		img2.display();
	}

}
