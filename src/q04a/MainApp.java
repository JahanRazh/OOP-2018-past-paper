package q04a;
/*iii) Create a class called that has the main () function
	l)Create two obJects of the CraditCard class
	2)Call the validate() method to check if the card validation work
	3)verify that both objects refer to a single CreditCard Object 
*/
public class MainApp {
	public static void main(String arg[]) {
		CreditCard card1 = CreditCard.getobject();
		CreditCard card2 = CreditCard.getobject();
		
		System.out.println(card1.validate("IT22591098112345",3));
		System.out.println(card2.validate("IT22591000212314",6));
	}
}
