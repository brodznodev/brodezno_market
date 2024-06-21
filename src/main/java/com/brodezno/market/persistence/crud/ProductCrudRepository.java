package com.brodezno.market.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.brodezno.market.persistence.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer>{
    
    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);

    Optional<List<Product>> findByStockAmountLessThanAndState(int stockAmount, boolean state);
}
