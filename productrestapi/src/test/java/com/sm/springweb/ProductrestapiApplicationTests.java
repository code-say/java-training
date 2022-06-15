package com.sm.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import com.sm.springweb.entities.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Test
	void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8090/products/1",Product.class);
		assertNotNull(product);
		assertNotNull("IPhone",product.getName());
		
	}
	
	@Test
	public void testCreateProduct()
	{
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Samsung Mobile");
		product.setDescription("Its Awesome");
		product.setPrice(1000);
		Product newProduct = restTemplate.postForObject("http://localhost:8090/products/",product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Samsung Mobile", newProduct.getName());
	}
	
	@Test
	void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8090/products/1",Product.class);
		product.setPrice(1400);
		restTemplate.put("http://localhost:8090/products/", product);
	}
	
	
	
	
	
	
	
	
	
	

	private void assertEquals(String string, String name) {
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(int id) {
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(String string, String name) {
		// TODO Auto-generated method stub
		
	}

	private void assertNotNull(Product product) {
		// TODO Auto-generated method stub
		
	}


}
