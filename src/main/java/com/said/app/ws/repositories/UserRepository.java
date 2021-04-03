package com.said.app.ws.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.said.app.ws.entitys.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
