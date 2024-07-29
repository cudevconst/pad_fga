package com.example.mobifonev2.Logging;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface LoggingRepository extends JpaRepository<Logging, Integer> {
    Page<Logging> findByUsernameContainingIgnoreCase(String keyword, Pageable pageable);


    @Query(value = "SELECT c.username as username, count(*) as count from CUONGNV.check_log c group by username order by count desc", nativeQuery = true)
    List<Object[]> countAllByUsername();

}


