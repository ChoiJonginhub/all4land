import java.util.ArrayList;
import java.util.List;

interface Graphic{
	void draw();
	default void add(Graphic graphic) {
	}
	default Graphic getGraphic() {
		return null;
	}
	default void remove(Graphic graphic) {
	}
}
class Line implements Graphic{
	@Override
	public void draw() {
		System.out.println("Draw line");
	}
}
class Text implements Graphic{
	@Override
	public void draw() {
		System.out.println("Draw text");
	}
}
class Square implements Graphic{
	@Override
	public void draw() {
		System.out.println("Draw square");
	}
}
class Picture implements Graphic{
	private List<Graphic> graphics;
	public Picture() {
		super();
		this.graphics=new ArrayList<Graphic>();
	}
	@Override
	public void add(Graphic graphic) {
		graphics.add(graphic);
	}
	@Override
	public Graphic getGraphic() {
		return this;
	}
	@Override
	public void remove(Graphic graphic) {
		graphics.remove(graphic);
	}
	@Override
	public void draw() {
		graphics.stream().forEach(Graphic::draw);
	}
}
public class compositeEx {

	public static void main(String[] args) {
		Graphic line = new Line();
		Graphic text = new Text();
		Graphic square = new Square();
		line.draw();
		text.draw();
		square.draw();
		System.out.println("-------");
		Graphic picture = new Picture();
		
		if(picture.getGraphic()!=null) {
			picture.add(line);
			picture.add(text);
			picture.add(square);
		}
		picture.draw();
	}

}
