package com.spaneos.product.service;

import com.spaneos.product.dao.ProductDao;
import com.spaneos.product.pojo.Product;

public class ProductService {
	private ProductDao productDao;
	public ProductService() {
			productDao=new ProductDao();
	}
	
	public String addProduct(Product product){
			return productDao.addProduct(product);
	}

	public Product setAndGetProduct(int pid, String pname, String description,
			double price, String instock) {
		Product product=new Product();
		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		product.setInstock(instock);
		product.setDescription(description);
		return product;
	}
}
