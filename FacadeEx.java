class Remocon{
	void TurnOn() {
		System.out.println("TV 켜기");
	}
	void TurnOff() {
		System.out.println("TV 끄기");
	}
}
class Movie{
	private String name="";
	public Movie(String name) {
		this.name=name;
	}
	void Search() {
		System.out.println(name+"영화 검색");
	}
	void Charge() {
		System.out.println("영화 결제");
	}
	void Play() {
		System.out.println("영화 재생");
	}
}
class Drink{
	private String name="";
	public Drink(String name) {
		this.name=name;
	}
	void Prepare() {
		System.out.println("음료 준비");
	}
}
class Viewer{
	private String drink_name="";
	private String movie_name="";
	
	public Viewer(String drink, String movie) {
		this.drink_name=drink;
		this.movie_name=movie;
	}
	void view() {
		Drink drink = new Drink(drink_name);
		Remocon remote = new Remocon();
		Movie movie = new Movie(movie_name);
		
		drink.Prepare();
		remote.TurnOn();
		movie.Search();
		movie.Charge();
		movie.Play();
	}
}
public class FacadeEx {

	public static void main(String[] args) {
		Viewer view = new Viewer("사이다", "아바타2");
		view.view();
	}

}
