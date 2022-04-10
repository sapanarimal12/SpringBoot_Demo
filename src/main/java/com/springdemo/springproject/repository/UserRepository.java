package com.springdemo.springproject.repository;

import com.springdemo.springproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.image.LookupOp;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findAllById(Long id);

    User findByUsernameAndPassword(String  username, String  password);


}
