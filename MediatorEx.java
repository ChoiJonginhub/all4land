import java.util.ArrayList;
import java.util.List;

interface Mediator{
	void addUser(Chat user);
	void deleteUser(Chat user);
	void sendMsg(String msg, Chat user);
}
abstract class Chat{
	protected Mediator mediator;
	protected String name;
	public Chat(Mediator m, String name) {
		this.mediator=m;
		this.name=name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg);
}
class ConcreteMediator implements Mediator{
	private final List<Chat> users;
	public ConcreteMediator() {
		this.users=new ArrayList<>();
	}
	@Override
	public void addUser(Chat user) {
		this.users.add(user);
	}
	@Override
	public void deleteUser(Chat user) {
		this.users.remove(user);
	}
	@Override
	public void sendMsg(String msg, Chat user) {
		for(Chat u:this.users) {
			if(u!=user) {
				u.receive(msg);
			}
		}
	}
}
class ConcreteChat extends Chat{
	public ConcreteChat(Mediator m, String name) {
		super(m, name);
	}
	@Override
	public void send(String msg) {
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMsg(msg, this);
	}
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}
}

public class MediatorEx {

	public static void main(String[] args) {
		Mediator m = new ConcreteMediator();
		Chat user1 = new ConcreteChat(m, "Lee");
		Chat user2 = new ConcreteChat(m, "Choi");
		Chat user3 = new ConcreteChat(m, "Yun");
		Chat user4 = new ConcreteChat(m, "Park");
		m.addUser(user4);
		m.addUser(user3);
		m.addUser(user2);
		m.addUser(user1);
		
		user1.send("반가워요");
		
		m.deleteUser(user3);
		System.out.println();
		
		user4.send("누구 나갔어?");
	}
	
}
