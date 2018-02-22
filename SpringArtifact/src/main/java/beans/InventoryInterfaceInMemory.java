package beans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class InventoryInterfaceInMemory implements InventoryInterface{
	
	private Map<Long, Inventory>inventoriesMap=new HashMap<Long, Inventory>();{
		Inventory inventory1 = new Inventory(123456789, "Java For Beginners", 100);
		Inventory inventory2 = new Inventory(987654321, "Advanced Java", 100);
		
		inventoriesMap.put(inventory1.getIsbn(), inventory1);
		inventoriesMap.put(inventory2.getIsbn(), inventory2);
	}
	
	public void insert(Inventory inventory) {
		inventoriesMap.put(inventory.getIsbn(), inventory);
	}
	
	public void update(Inventory inventory) {
		inventoriesMap.put(inventory.getIsbn(), inventory);
	}
	
	public void update(List<Inventory>inventories) {
		for (Inventory inventory: inventories) {
			update(inventory);
		}
	}
	
	public void delete(long inventoryIsbn) {
		inventoriesMap.remove(inventoryIsbn);
	}
	
	public Inventory find(long inventoryIsbn) {
		return inventoriesMap.get(inventoryIsbn);
	}
	
	public List<Inventory>find(List<Long>inventoryIsbn){
		List<Inventory>inventories = new ArrayList<Inventory>();
		for(Long isbn: inventoryIsbn) {
			inventories.add(inventoriesMap.get(isbn));
		}
		return inventories;
	}
	
	public List<Inventory>find(String bookName){
		List<Inventory>inventories = new ArrayList<Inventory>();
		for(Inventory inventory: inventoriesMap.values()) {
			if(bookName.equals(inventory.getBookName())) {
				inventories.add(inventory);
			}
		}
		return inventories;
	}
	
	public List<Inventory>find(boolean locked){
		List<Inventory>inventories = new ArrayList<Inventory>();
		for(Inventory inventory: inventoriesMap.values()) {
			if(locked == (inventory.isLocked())) {
				inventories.add(inventory);
			}
		}
		return inventories;
	}

}
