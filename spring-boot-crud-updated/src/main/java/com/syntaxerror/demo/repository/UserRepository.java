package com.syntaxerror.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.syntaxerror.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "select * from user where salary =:salary", nativeQuery = true)
	public List<User> getUserBySalary(@Param("salary") float salary);

}
