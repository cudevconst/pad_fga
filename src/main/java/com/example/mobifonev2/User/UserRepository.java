package com.example.mobifonev2.User;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    @Query(value="select distinct * from CUONGNV.table_user  where username = :username and password = :password", nativeQuery = true)
    Optional<User> findByUsernameAndPassword(String username, String password);
}
