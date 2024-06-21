package com.brodezno.market.persistence;

import com.brodezno.market.persistence.crud.ProductCrudRepository;
import com.brodezno.market.persistence.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

// Repository class for products that interacts with the database
@Repository
public class ProductRepository {
    private ProductCrudRepository productCrudRepository;

    // Get all products
    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll(); // Cast to List<Product> to return a list of products
    }

    // Get products by category
    public List<Product> getByCategory(int idCategory) {
        return productCrudRepository.findByIdCategoryOrderByNameAsc(idCategory); // Get products by category and order them by name
    }

    // Get products with low stock 
    public List<Product> getScarceProducts(int stockAmount) {
        return productCrudRepository.findByStockAmountLessThanAndState(stockAmount, true).orElse(null); // Get products with stock less than stockAmount and state true
    }

    // Get product by id
    public Optional<Product> getProduct(int idProduct) {
        return productCrudRepository.findById(idProduct); // Get product by id
    }

    // Save product
    public Product save(Product product) {
        return productCrudRepository.save(product); // Save product
    }

    // Delete product
    public void delete(int idProduct) {
        productCrudRepository.deleteById(idProduct); // Delete product by id
    }
}