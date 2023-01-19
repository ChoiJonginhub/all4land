import java.util.Iterator;

interface Aggregate{
	Iterator createIterator();
}
class Book{
	private String name;
	public Book(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int size) {
		books = new Book[size];
	}
	public Book getBook(int index) {
		return books[index];
	}
	public int getLength() {
		return last;
	}
	public void appendBook(Book b) {
		if(last<books.length) {
			this.books[last]=b;
			last++;
		}else {
			System.out.println("책꽂이가 꽉 참!");
		}
	}
	@Override
	public Iterator createIterator() {
		return new BookShelfIterator(this);
	}
}
class BookShelfIterator implements Iterator<Book>{
	private BookShelf bookShelf;
	private int index = 0;
	public BookShelfIterator(BookShelf bs) {
		this.bookShelf=bs;
	}
	@Override
	public boolean hasNext() {
		return index< bookShelf.getLength();
	}
	@Override
	public Book next() {
		Book b = bookShelf.getBook(index);
		index++;
		return b;
	}
}

public class iteratorEx {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		
		Book b1 = new Book("셜록 홈즈");
		Book b2 = new Book("반지의 제왕");
		Book b3 = new Book("눈물을 마시는 새");
		Book b4 = new Book("알쓸신잡");
		
		bookShelf.appendBook(b1);
		bookShelf.appendBook(b2);
		bookShelf.appendBook(b3);
		bookShelf.appendBook(b4);
		
		System.out.println("현재 꽂힌 책은 총 "+bookShelf.getLength()+"권입니다.");
		
		Iterator it = bookShelf.createIterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
