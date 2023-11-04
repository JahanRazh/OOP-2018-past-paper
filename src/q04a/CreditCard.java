package q04a;
/*4)
 a) A credit card vall&tion class called needs to be implemented as a
Singleton.
i) Implement creaditcard class as a singleton
ii) Implement the method called
	bool validate( String cardno,int code)
	the length of the should be 16 and the code should be divisible by
	the number three
*/
public class CreditCard {
	
	public static CreditCard card = null ;
		
	private CreditCard() {
	}
	public static CreditCard getobject() {
		if(card == null) {
			card = new CreditCard();
			System.out.println("new object created!");
		}else {
			System.out.println("Returning Existing object");
		}
		return card;
	}
//II)
	public boolean validate(String cardNo,int code) {
		int remainder = code % 3;
		
		//if (cardNo.length() == 16 && remainder == 0) {
			
		//	return true;
		//}
		//else {
		//	return false;
		//}
		//ekavara karnd puluvan mehem dala 
		return(cardNo.length()== 16 && remainder == 0);
	}
}
