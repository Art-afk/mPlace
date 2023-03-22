package com.klimov.mplace.repo;

import com.klimov.mplace.models.Addresses;
import org.springframework.data.repository.CrudRepository;

public interface AddressesRepository  extends CrudRepository<Addresses,Long> {
}
