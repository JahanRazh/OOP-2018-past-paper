package q04b;
/*
 IV) Implenrnt the Mobi class that allows the user to customize the various
in the Mobile Application used for the Office Automaucn
l) Have an array Of Command ( Objects to represent
commands that can be issued by the Mobile
2) In tlr constructor declare the array to contain 6
c«nmand Buttoas.
3) Implement a method called
secCcm•nand (Int czdÄ)
It should store the cmdObj under tlr correct index in tlr
Command [ array.
4) Implement a rnethod called
public void cortrmandPresseä (Int Index)
This should execute the conmand gtven by tlr object.
 */
public class MobileUI {
	private Command commands[];

	public MobileUI() {
		super();
		commands = new Command[6];
	}
	
	public void setCommand(int index,Command conobj) {
		commands[index] = conobj;
	}
	public void commandpressed(int index) {
		commands[index].execute();
	}

	
}
