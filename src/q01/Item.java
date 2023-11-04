package q01;

public abstract class Item {
	private int itemNo;
	private String description;
	private Double unitPrice;
	
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public void Display() {
		System.out.println(itemNo);
		System.out.println(description);
		System.out.println(this.unitPrice);
	}
}
