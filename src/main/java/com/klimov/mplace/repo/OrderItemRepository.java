package com.klimov.mplace.repo;

import com.klimov.mplace.models.OrderItems;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository  extends CrudRepository<OrderItems,Long> {
}
