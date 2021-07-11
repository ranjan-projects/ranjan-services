package com.ranjanenterprises.repository;

import com.ranjanenterprises.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository<UserEntity, String> {

}
