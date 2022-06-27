package com.tin19.test_projekt.repository;

import antlr.ASTNULLType;
import com.tin19.test_projekt.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
/*
    @Query("select p from Person p left join fetch Drucker d where p.drucker_id =:d.drucker_id ")
    Optional<Person> findByIdWithEagerRelationships(@Param("drucker_id") Long d_id);
*/
}
