package com.weshopify.platform.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weshopify.platform.entity.product.Product;
import com.weshopify.platform.exception.ProductNotFoundException;

@RestController
public class ProductRestController {

	@Autowired private ProductService service;
	
	@PostMapping("/products/check_unique")
	public String checkUnique(Integer id, String name) {
		return service.checkUnique(id, name);
	}	
	
	@GetMapping("/products/get/{id}")
	public ProductDTO getProductInfo(@PathVariable("id") Integer id) 
			throws ProductNotFoundException {
		Product product = service.get(id);
		return new ProductDTO(product.getName(), product.getMainImagePath(), 
				product.getDiscountPrice(), product.getCost());
	}
}
