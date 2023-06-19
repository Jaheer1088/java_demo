package inff;

class Author {
    //Implement your code here
	private String name;
	private String emailId;
	private char gender;
	Author(String name,String emailId,char gender){
		this.name=name;
		this.emailId=emailId;
		this.gender=gender;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void authorAddress() {
		System.out.println("City: Hyd");
	}
	
}


class Book {
	
    //Implement your code here 
	private String name;
	private Author author;
	private double price;
	private int quantity;
	Book(String name,Author author,double price,int quantity){
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void displayAuthorDetails() {
		System.out.println("Displaying Author Details");
		System.out.println("Name:" +author.getName());
		System.out.println("Email Id:" +author.getEmailId());
		System.out.println("Gender:"+author.getGender());
	}
	
	
}
//class Library extends Book{
//	private String libraryName;
//	Library(String libraryName,String name,Author author,double price,int quantity){
//	super(name,author,price,quantity);
//	this.libraryName=libraryName;
//	//this.getAuthor.authorAddress();
//	}
//	{
//	Author.authorAddress();
//	}
//}
	


class Po {
    public static void main(String[] args) {
        //Implement your code here
    	Author a=new Author("Bloach","@123.com",'M');
    	Book b=new Book("Effective java",a,45.0,15);
    	b.displayAuthorDetails();    
    	}
}

