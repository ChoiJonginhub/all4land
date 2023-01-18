interface Command{ //캡슐화
	public void run();
}
class HeaterCommand implements Command{
	private Heater heater;
	public HeaterCommand(Heater h) {
		this.heater=h;
	}
	@Override
	public void run() {
		heater.on();
	}
}
class Heater{
	void on() {
		System.out.println("Heater On!");
	}
}
class LightCommand implements Command{
	private Light light;
	public LightCommand(Light l) {
		this.light=l;
	}
	@Override
	public void run() {
		light.on();
	}
}
class Light {
	void on() {
		System.out.println("Light On!");
	}
}

class AIspeaker{
	private Command cmd;
	public void setCmd(Command cmd) {
		this.cmd=cmd;
	}
	public void talk() {
		cmd.run();
	}
}

public class CommandEx {
	public static void main(String[] args) {
		Light l = new Light();
		Heater h = new Heater();
		Command heaterOn = new HeaterCommand(h);
		Command lightOn = new LightCommand(l);
		
		AIspeaker clova = new AIspeaker();
		
		clova.setCmd(lightOn);
		clova.talk();
		
		clova.setCmd(heaterOn);
		clova.talk();
	}
}
