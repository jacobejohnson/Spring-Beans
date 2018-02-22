package beans;

public class InventoryServiceImpl implements InventoryService{
	
private InventoryInterface inventoryInterface;
	
	public InventoryInterface getInventory() {
		return inventoryInterface;
	}
	
	public void setInventoryInterface(InventoryInterface inventoryInterface) {
		this.inventoryInterface=inventoryInterface;
	}
	
	public void subtractBooks(long sourceInventoryIsbn, long targetInventoryIsbn, int inventory) {
		Inventory sourceInventory = inventoryInterface.find(sourceInventoryIsbn);
		Inventory targetInventory = inventoryInterface.find(targetInventoryIsbn);
		
		sourceInventory.setInventory(sourceInventory.getInventory() - inventory);
		targetInventory.setInventory(targetInventory.getInventory() + inventory);
		
		inventoryInterface.update(sourceInventory);
		inventoryInterface.update(targetInventory);
	}
	
	public Inventory getInventory(long inventoryIsbn){
		return inventoryInterface.find(inventoryIsbn);
	}

	public void addBooks(long inventoryIsbn, int inventory) throws Exception {
		// TODO Auto-generated method stub
		
	}
	


}
