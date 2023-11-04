package q04b;
/*
)l.mplenrnt a class called which contams the main ( ) fux-tiotr
I)Create an object of the class-
2)Create an Oven Object called mainOven.
3)Create a GarageGate Object called garageGate
4)Create 4 command buttons to control turmng the Oven on and Off
and Open and Close the Gaz ageGate_
5)Sunulate the use of the Oven arÆ tlr GarageGate.

*/
public class MainApp {

	public static void main(String[] args) {
		
		MobileUI mobile = new MobileUI();
		
		Oven mainOven = new Oven("mainOven");
		GarageGate garageGate = new GarageGate("garageGate");
		
		Command c1 = new OvenOn(mainOven);
		Command c2 = new OvenOff(mainOven);
		Command c3 = new GarageGateOpen(garageGate);
		Command c4 = new GarageGateClose(garageGate);
		
		mobile.setCommand(1, c1);
		mobile.setCommand(2, c2);
		mobile.setCommand(3, c3);
		mobile.setCommand(4, c4);
		
		mobile.commandpressed(1);
		mobile.commandpressed(2);
		mobile.commandpressed(3);
		mobile.commandpressed(4);
		
		

	}

}