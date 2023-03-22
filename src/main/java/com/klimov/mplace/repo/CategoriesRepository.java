package com.klimov.mplace.repo;

import com.klimov.mplace.models.Categories;
import org.springframework.data.repository.CrudRepository;

public interface CategoriesRepository extends CrudRepository<Categories,Long> {
}
