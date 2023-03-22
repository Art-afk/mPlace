package com.klimov.mplace.repo;

import com.klimov.mplace.models.Reviews;
import org.springframework.data.repository.CrudRepository;

public interface ReviewsRepository extends CrudRepository<Reviews,Long> {
}
