package com.klimov.mplace.repo;

import com.klimov.mplace.models.OrderAddresses;
import org.springframework.data.repository.CrudRepository;

public interface OrderAddressesRepository  extends CrudRepository<OrderAddresses,Long> {
}
