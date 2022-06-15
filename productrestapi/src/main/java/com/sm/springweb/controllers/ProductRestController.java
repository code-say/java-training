package com.sm.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sm.springweb.entities.Product;
import com.sm.springweb.repos.ProductRepository;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductRepository respository;
	
	@RequestMapping(value="/products/",method=RequestMethod.GET)
	public List<Product> getProducts()
	{
		return respository.findAll();
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.GET)
	public Product getProduct(@PathVariable("id")int id)
	{
		return respository.findById(id).get();
	}

	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product)
	{
		return respository.save(product);
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product)
	{
		return respository.save(product);
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id")int id)
	{
		respository.deleteById(id);
	}
	
	
	
	
	
	
}