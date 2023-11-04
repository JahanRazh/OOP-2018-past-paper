package q03;


import java.util.ArrayList;
import java.util.Scanner;

/*

ii) Implement a class called Student

	l) Have the following properties
	id, names, marks, and noOfSubjects
	(id and noOfsubjects are integers, marks is a float array)

	2) Implement a constructor to get values for id and
	name as parameters and initialize them.

	3) Implement a method called float inputMarks (int index)
	which allows you to enter one mark from the keyboard and return It
	Here :index is the subject number of the marks.

		Note index is an integer which is greater than zero.

		l. If the <0 or marks > 100 throw a MarksException
		2. Ignore any error that can occur through the keyboard

	4) Implement a method called void input ( ) which allows you to
	enter all the marks Of a student.

		1. Input a value for noOfSubjects
		2. Input values for the marks using the inputMarks()
		method
		3. Handle MarksException and possible errors
		entering the input value for noofSubjects

	5) Implement a method called f Ioat getAverage( ) to calculate
	the ataage of the marks stored marks: : array. Handle tlr
	Dilision by zero enor which can happen if tpere are no marks

iii) Implenrnt a class called MAinApp which has a main() Function
		1) Create a student Object.	
		2) Call the input( ) method	
		3) Display the ustng the getAverage( ) method

*/
public class Student{
	private int id;
	private String name;
	private ArrayList<Float> marks = new ArrayList<>();
	private int noOfSubject;
	
	public Student(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public float inputMarks(int index) throws MarkException {
		
		System.out.print("Enter Mark:");
		Scanner sc = new Scanner(System.in);
		
		
		float i = sc.nextFloat();
		marks.add(i);
		// marks kiyanne object ek array eke 
		//index kiyanne array eke index ek get ek dala balanne 
		if(marks.get(index)>= 0 && marks.get(index)<= 100){
			return marks.get(index);
		}
		else {
			marks.remove(index);
			throw new MarkException(marks.get(index));
		}
		
	}
	//4)
	public void input() {
		System.out.print("Enter No of subject:");
		Scanner sc1 = new Scanner (System.in);
		
		
		noOfSubject = sc1.nextInt();
		
		try {
			for(int i=0;i < noOfSubject;i++) {
				inputMarks(i);
			}
		}catch (MarkException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		
	}
	//5)
	public float getAverage() {
		float total =0.0f;
		int count = 0;
		float average =0;
		
		for (Float t : marks) {
			total=total+t;
			count++;
		}
		try {
			average = total/count;
		} catch (ArithmeticException e) {//Exception
			e.printStackTrace();
		}
		
		return average;
	}
}
