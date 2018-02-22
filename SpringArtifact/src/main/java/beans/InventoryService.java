package beans;

public interface InventoryService {
	
	public void subtractBooks(long sourceInventoryIsbn, long targetInventoryIsbn, int inventory);
	public void addBooks(long inventoryIsbn, int inventory) throws Exception;
	public Inventory getInventory(long inventoryIsbn);

}
