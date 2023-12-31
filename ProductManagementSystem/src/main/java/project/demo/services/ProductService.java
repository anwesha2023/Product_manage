package project.demo.services;

import java.util.List;

import project.demo.entities.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	public List<Product> getAllProduct();
	public Product getProductById(Integer id);
	public String deleteProduct(Integer id);
}
