package com.springdemo.springproject.repository;

import com.springdemo.springproject.model.AppUser;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepository {

    //Optional<AppUser> findByEmail(String email);

}
