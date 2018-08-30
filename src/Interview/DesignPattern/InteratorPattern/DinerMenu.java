package src.InteratorPattern;

import src.InteratorPattern.MenuItem;

import java.util.Iterator;


public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public Iterator creatIterator() {
		return (Iterator) new DinerMenuIterator(menuItems);
	}
}