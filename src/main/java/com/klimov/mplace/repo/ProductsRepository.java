package com.klimov.mplace.repo;

import com.klimov.mplace.models.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products,Long> {
}
