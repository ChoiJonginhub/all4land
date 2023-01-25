import java.util.ArrayList;
import java.util.List;

class Originator {
	private String state;
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
class Memento{
	private String state;
	public Memento(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
}
class CareTaker{
	private List<Memento> mementoList = new ArrayList<Memento>();
	public void add(Memento state) {
		mementoList.add(state);
	}
	public Memento get(int index) {
		return mementoList.get(index);
	}
}


public class MementoEx {

	public static void main(String[] args) {
		Originator origin = new Originator();
		CareTaker ct = new CareTaker();
		origin.setState("상태 1");
		origin.setState("상태 2");
		ct.add(origin.saveStateToMemento());
		origin.setState("상태 3");
		ct.add(origin.saveStateToMemento());
		origin.setState("상태 4");
		
		System.out.println("현재 상태 : "+origin.getState());
		origin.getStateFromMemento(ct.get(0));
		System.out.println("저장 상태 1 : "+origin.getState());
		origin.getStateFromMemento(ct.get(1));
		System.out.println("저장 상태 2 : "+origin.getState());
	}

}
