package q04b;
/*
 IV) Create the classes ovenOn and oveOff that implement the command interface
	1) Both classes should have Oven type objects as properties
	2) The constructors of both classes should take Oven type objects as
	3) Implement the execute() method should respectively call the
		On() and Off() methods of the Oven class object property
 */
public class OvenOn implements Command {
	
	private Oven o;
	
	public OvenOn(Oven o) {
		super();
		this.o = o;
	}



	@Override
	public void execute() {		
		o.On();	

	}

}
