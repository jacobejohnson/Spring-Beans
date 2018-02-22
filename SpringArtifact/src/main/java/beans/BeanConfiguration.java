package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	
	@Bean
	public InventoryInterface inventoryInterface() {
		InventoryInterfaceInMemory bean = new InventoryInterfaceInMemory();
		return bean;
	}
	
	@Bean
	public InventoryServiceImpl inventoryServiceImpl() {
		InventoryServiceImpl bean = new InventoryServiceImpl();
		bean.setInventoryInterface(inventoryInterface());
		return bean;
	}

}
