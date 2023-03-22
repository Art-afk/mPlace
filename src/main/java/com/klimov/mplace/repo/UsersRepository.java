package com.klimov.mplace.repo;

import com.klimov.mplace.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users,Long> {
}
