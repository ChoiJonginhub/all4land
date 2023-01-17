interface Color {
	String fill();
}

abstract class Brush{
	protected Color color;
	protected Brush(Color color) {
		this.color=color;
	}
	public abstract String draw();
}

class Red implements Color{
	@Override
	public String fill() {
		return "color : red";
	}
}
class Green implements Color{
	@Override
	public String fill() {
		return "color : red";
	}
}

class Pencil extends Brush {
	public static final String type="[pencil]";
	public Pencil(Color color) {
		super(color);
	}
	@Override
	public String draw() {
		return "Brush : " +type+ color.fill();
	}
}
class Sharp extends Brush {
	public static final String type="[sharp]";
	public Sharp(Color color) {
		super(color);
	}
	@Override
	public String draw() {
		return "Brush : " +type+ color.fill();
	}
}

public class bridgeEx {

	public static void main(String[] args) {
		Brush redpencil = new Pencil(new Red());
		Brush greensharp = new Sharp(new Green());
		System.out.println(redpencil.draw());
		System.out.println(greensharp.draw());
	}

}
