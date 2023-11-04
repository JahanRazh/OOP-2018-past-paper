package q01;

public class Car extends Item {
	private String model;
	private String type;

	//create constructor

	public Car(int itemNo, String description, double unitPrice, String model, String type) {
		super(itemNo, description, unitPrice);
		this.model = model;
		this.type = type;
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		super.Display();
		System.out.println(this.model);
		System.out.println(this.type);
	}

	

}
