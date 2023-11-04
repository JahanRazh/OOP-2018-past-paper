package q01;

public class Book extends Item {
	private String publisher;
	private String category;
	private int pages;
	
	public Book(int itemNo, String description, double unitPrice, String publisher, String category, int pages) {
		super(itemNo, description, unitPrice);
		this.publisher = publisher;
		this.category = category;
		this.pages = pages;
	}

	@Override// override වී ඇත 
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println(this.publisher);// this කැමතිනම් දන්න
		System.out.println(category);
		System.out.println(pages);
		
	}
	
	

}
