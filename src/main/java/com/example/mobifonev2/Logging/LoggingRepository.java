package com.example.mobifonev2.Logging;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoggingRepository extends JpaRepository<Logging, Integer> {

    @Query(value = "select * from CUONGNV.check_log c where username like %?1% or ip like %?1%", nativeQuery = true)
    Page<Logging> findByUsernameContainingOrIpContaining(String keyword, Pageable pageable);


    @Query(value = "SELECT c.username as username, count(*) as count from CUONGNV.check_log c group by username order by count desc", nativeQuery = true)
    List<Object[]> countAllByUsername();

}


