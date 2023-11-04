package q03;
/*a) A program is reqtnred to process students marks m an exammatiorr Implement the
followtng classes that makes use of exception handling.
i) Implement a user defined exception class

1)Have a property called marks
2)Implenrnt a constructor to get the masks proiMty as a paranrter
and initiallZI it
3)Implement a getter for the marks property
*/
public class MarkException extends Throwable {
	private float marks;

	public MarkException(float marks) {
		super();
		this.marks = marks;
	}

	public float getMarks() {
		return marks;
	}

	
}
