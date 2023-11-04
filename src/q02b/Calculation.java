package q02b;
/*b) In this you will use threads to compute the factorial of a large number
i) a class called Calculation.
l) Have a double-type property called ans
2) Implement a getter for
3) Implement a method called 
void Factorial(int start,int end)
which should compute the multiplication of the numbers between
start and store it in ans.

e.g. Factorial(5,10) > 5*6*7*8*9*10

This method should be implemented in such a way that multiple
threads should be able to access it.*/

public class Calculation {
	private double ans=1;

	public double getAns() {
		return ans;
	}
	public void Factorial(int start,int end)
	{
		System.out.println("Comp statr"+start+"to end"+end);
		
		for(int i =start;i<=end;i++)
		{
			ans*=(double)i;
		}
	}
	

}
