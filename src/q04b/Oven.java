package q04b;
/*
b) A Mobile Phone company has partnered with a construction firm to build houses
With automation built A software designer has suggested that the Command
Design pattern can be used for tins purpose
i) Create a Receiver class called Oven. The Oven class should have a
a property called name.
1) Create a constructor to pass the name of the oven.
2) Create the methods On( ) and off( ) Display appropriate Messages
when they are called
 */
public class Oven {
	private String name;
	
	public Oven(String name) {
		super();
		this.name = name;
	}
	public void On() {
		System.out.println(name+"Switch on!");
	}
	public void Off() {
		System.out.println(name+"Switch off!");
	}
}
