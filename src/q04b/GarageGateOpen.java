package q04b;
/*
 v)Create tlr classes GarageGateOpen and GarageGateC10se that implement the Command mtefface
	1) Both classes should have GarageGate type objects as propernes
	2) constructors of both classes should take type
	objects as parameters
	3) Implement the execute( ) method, they should respectively call
	the Open() and Close() methods Of the GarageGate class
	object property 
 */
public class GarageGateOpen implements Command {
	private GarageGate g;
	
	public GarageGateOpen(GarageGate g) {
		super();
		this.g = g;
	}

	@Override
	public void execute() {
		g.Open();

	}

}
