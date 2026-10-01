package mcp.shopping.list;

import mcp.shopping.list.service.ShoppingCart;
import java.util.List;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpShoppingListApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpShoppingListApplication.class, args);
	}


	@Bean
	public List<ToolCallback> tools(ShoppingCart shoppingCart) {
		return List.of(ToolCallbacks.from(shoppingCart));
	}
}