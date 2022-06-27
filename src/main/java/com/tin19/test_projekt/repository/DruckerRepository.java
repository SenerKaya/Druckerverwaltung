package com.tin19.test_projekt.repository;

import com.tin19.test_projekt.model.Drucker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DruckerRepository extends CrudRepository<Drucker, Long> {
/*
    @Query("select d from Drucker d left join fetch d.person where d.d_id =:d.p_id")
    Optional<Drucker> findByIdWithEagerRelationships(@Param("drucker_id") Long d_id);
*/

}
