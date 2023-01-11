interface Manager { //구성요소 1
}
class SoccerManager implements Manager{
}
class BaseballManager implements Manager{
}

interface Team { // 구성요소 2
}
class SoccerTeam implements Team{
}
class BaseballTeam implements Team{
}

interface Player {
	Manager setManager();
	Team setTeam();
}
class Splayer implements Player{
	@Override
	public Manager setManager() {
		return new SoccerManager();
	}
	@Override
	public Team setTeam() {
		return new SoccerTeam();
	}
}
class Bplayer implements Player{
	@Override
	public Manager setManager() {
		return new BaseballManager();
	}
	@Override
	public Team setTeam() {
		return new BaseballTeam();
	}
}
public class AbstractFactoryEx {
	public static void main(String[] args) {
		setPlayer(new Splayer());
		setPlayer(new Bplayer());
	}
	private static void setPlayer(Player p) {
		Manager m = p.setManager();
		Team t = p.setTeam();
	}
}
