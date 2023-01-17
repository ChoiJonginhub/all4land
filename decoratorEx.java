interface Component {
	String add();
}
class BaseComponent implements Component{
	@Override
	public String add() {
		return "에스프레소";
	}
}
abstract class Decorator implements Component{
	private Component coffeeComponent;
	
	public Decorator(Component coffeeComponent) {
		this.coffeeComponent=coffeeComponent;
	}
	public String add() {
		return coffeeComponent.add();
	}
}
class WaterDeco extends Decorator{
	public WaterDeco(Component coffeeComponent) {
		super(coffeeComponent);
	}
	@Override
	public String add() {
		return super.add()+"+물";
	}
}
class MilkDeco extends Decorator{
	public MilkDeco(Component coffeeComponent) {
		super(coffeeComponent);
	}
	@Override
	public String add() {
		return super.add()+"+우유";
	}
}
class SugarDeco extends Decorator{
	public SugarDeco(Component coffeeComponent) {
		super(coffeeComponent);
	}
	@Override
	public String add() {
		return super.add()+"+설탕";
	}
}
public class decoratorEx {

	public static void main(String[] args) {
		Component es = new BaseComponent();
		Component am = new WaterDeco(new BaseComponent());
		Component la = new SugarDeco(new MilkDeco(new WaterDeco(new BaseComponent())));
		
		System.out.println("에스프레소:"+es.add());
		System.out.println("아메리카노:"+am.add());
		System.out.println("카페라떼:"+la.add());
	}

}
