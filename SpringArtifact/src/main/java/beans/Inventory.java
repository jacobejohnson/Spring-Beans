package beans;

import java.util.Date;

public class Inventory {
	private long isbn;
	private String bookName;
	private int inventory;
	private boolean locked;
	
	public Inventory() {
		
	}
	
	public Inventory(long isbn, String bookName, int inventory) {
		this.isbn=isbn;
		this.bookName=bookName;
		this.inventory=inventory;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	
	
}
