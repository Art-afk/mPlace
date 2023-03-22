package com.klimov.mplace.repo;

import com.klimov.mplace.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository  extends CrudRepository<Orders,Long> {
}
