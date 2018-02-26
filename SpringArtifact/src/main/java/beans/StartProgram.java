//Jacob Johnson
//jejohnson8@dmacc.edu
package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		InventoryService inventoryService = applicationContext.getBean("inventoryService", InventoryService.class);
		
		System.out.println("Before book sale");
		System.out.println("Java For Beginners Inventory: " + inventoryService.getInventory(1).getInventory());
		System.out.println("Advanced Java Inventory: " + inventoryService.getInventory(2).getInventory());
		
		inventoryService.subtractBooks(1, 2, 5);
		
		System.out.println("After book sale");
		System.out.println("Java For Beginners Inventory: " + inventoryService.getInventory(1).getInventory());
		System.out.println("Advanced Java Inventory: " + inventoryService.getInventory(2).getInventory());
	}

}
