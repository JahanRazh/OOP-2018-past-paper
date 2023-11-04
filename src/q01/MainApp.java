package q01;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
	//List කියල arry එකට නමක් දීලා තියෙන්නේ 
		ArrayList<Item> List = new ArrayList<Item>();
		
		Book b1 = new Book(1,"book1", 100.0, "abc","story", 120);
		Book b2 = new Book(2,"book2",200.0,"cde","education", 130);
		
		Car c1 = new Car(3,"car1",150000.0,"toyata","ac");
		//Car c2 = new Car(4,"Car2",300000.0,"honda","nonac");
		
		List.add(b1); // list එකට object එක add කර ගන්නවා
		List.add(b2);
		List.add(c1);
		List.add(new Car(4,"Car2",300000.0,"honda","nonac"));
		//for each එක දල 
		for (Item i : List) {
			i.Display();
		}
		

		
	}

}
