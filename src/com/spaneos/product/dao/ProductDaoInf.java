package com.spaneos.product.dao;

import java.util.List;

import com.spaneos.product.pojo.Product;

public interface ProductDaoInf {
			public String addProduct(Product product);
			public Product getProduct(int pid);
			public List<Product> getProducts();
			public String deleteProduct(int pid);
			public String updateProduct(Product product);
}
