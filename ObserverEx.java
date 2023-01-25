import java.util.ArrayList;
import java.util.List;

class Observer {
	public String msg;
	public void receive(String msg) {
		System.out.println(this.msg+"의 메시지 : "+msg);
	}
}
class User1 extends Observer{
	public User1(String msg) {
		this.msg=msg;
	}
}
class User2 extends Observer{
	public User2(String msg) {
		this.msg=msg;
	}
}
class Notice{
	private List<Observer> observers = new ArrayList<Observer>();
    // 옵저버에 추가
    public void attach(Observer observer){
        observers.add(observer);
    }
    // 옵저버에서 제거
    public void detach(Observer observer){
        observers.remove(observer);
    }
    // 옵저버들에게 알림
    public void notifyObservers(String msg){
        for (Observer o:observers) {
            o.receive(msg);
        }
    }
}

public class ObserverEx {

	public static void main(String[] args) {
		Notice notice = new Notice();
        User1 user1 = new User1("유저1");
        User2 user2 = new User2("유저2");
        
        notice.attach(user1);
        notice.attach(user2);
       
        String msg = "공지사항입니다~!";
        notice.notifyObservers(msg);

        notice.detach(user1); // user1 공지사항 받는 대상에서 제거
        msg = "안녕하세요~";
        notice.notifyObservers(msg);
	}

}
