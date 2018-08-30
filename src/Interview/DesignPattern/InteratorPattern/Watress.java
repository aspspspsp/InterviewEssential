package src.InteratorPattern;

import java.util.Iterator;

public class Watress {
	static DinerMenu dinerMenu;

	public static void main(String[] args) {
		dinerMenu = new DinerMenu();
		printMenu();
	}
	
	public static void printMenu() {
		MenuItem[] items = new MenuItem[6];
		for(int i = 0; i < items.length; i ++) {
			items[i] = new MenuItem("A" + i);
		}

		Iterator menuInerator = dinerMenu.creatIterator();
		printMenu(menuInerator);
		
	}
	
	public static void printMenu(Iterator iterator) {
		while(iterator.hasNext())
		{
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.println(menuItem.getPrice());
		}
	}
}
