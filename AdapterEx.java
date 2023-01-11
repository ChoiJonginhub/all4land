class Volt{
	private int volts;
	public Volt(int v) {
		this.volts=v;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolts(int volts) {
		this.volts = volts;
	}
}

class Socketv {
	public Volt getVolt() {
		return new Volt(120);
	}
}

interface SocketAdapter { //어댑터 인터페이스
	public Volt get120Volt();
	public Volt get12Volt();
	public Volt get3Volt();
}
// Class Adapter(상속 활용)
class ScAdapterClass extends Socketv implements SocketAdapter{
	@Override
	public Volt get120Volt() {
		return getVolt();
	}
	@Override
	public Volt get12Volt() {
		Volt v=getVolt();
		return convertVolt(v,10);
		
	}
	@Override
	public Volt get3Volt() {
		Volt v=getVolt();
		return convertVolt(v,40);
	}
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
public class AdapterEx {

	public static void main(String[] args) {
		testAdapter();

	}
	private static void testAdapter() {
		SocketAdapter sa = new ScAdapterClass();
		Volt v3 = getVolt(sa, 3);
		Volt v12 = getVolt(sa, 12);
		Volt v120 = getVolt(sa, 120);
		System.out.println("v3 using Adapter="+v3.getVolts());
		System.out.println("v12 using Adapter="+v12.getVolts());
		System.out.println("v120 using Adapter="+v120.getVolts());
	}
	private static Volt getVolt(SocketAdapter adapter, int i) {
		switch(i) {
		case 3: return adapter.get3Volt();
		case 12: return adapter.get12Volt();
		case 120: return adapter.get120Volt();
		default: return adapter.get120Volt();
		}
	}
}
