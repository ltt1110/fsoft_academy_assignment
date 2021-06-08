package exercise1;

public class Book {
	private String name;
	private String ISBM;
	private String author;
	private String publisher;

	public Book() {

	}

	public Book(String name, String author, String ISBM, String publisher) {

		this.name = name;
		this.ISBM = ISBM;
		this.author = author;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBM() {
		return ISBM;
	}

	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "name=" + name + ", author=" + author + ", ISBM=" + ISBM + ", publisher=" + publisher;
	}

	public void getBookInfo() {
		System.out.println(toString());
	}

}
