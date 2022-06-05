package ch21;

public class Book {
	private String name;
	private String author;
	public Book() {}
	public Book(String t,String a) {
		this.name = t;
		this.author=a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(name +" "+ author);
	}
	
}
