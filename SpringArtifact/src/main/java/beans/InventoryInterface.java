package beans;
import java.util.List;
public interface InventoryInterface {
	
	public void insert(Inventory inventory);
	public void update(Inventory inventory);
	public void update(List<Inventory>inventories);
	public void delete(long inventoryIsbn);
	public Inventory find(long inventoryIsbn);
	public List<Inventory>find(List<Long>inventoryIsbns);
	public List<Inventory>find(String bookName);
	public List<Inventory>find(boolean locked);

}
