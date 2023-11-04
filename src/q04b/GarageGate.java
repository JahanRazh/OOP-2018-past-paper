package q04b;
/*
 ii) Create a Receiver class called GarageGate. The GarageGate class
should have a property called
	1) Create a constructor to pass the of the Garage Gate
	2) Create the methods Open( ) and Close( ). Display appropriate
	Messages when they are called
*/
public class GarageGate {
	private String description;

	public GarageGate(String description) {
		super();
		this.description = description;
	}
	public void Open() {
		System.out.println(description+"Closing!");
	}
	
	public void Close(){
		System.out.println(description+"Closing!");
	}
}
