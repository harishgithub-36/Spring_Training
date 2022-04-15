package com.syntaxerror.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.syntaxerror.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select u from user u where u.salary =:salary", nativeQuery = true)
	public List<User> getUserBySalary(@Param("salary") float salary);

	@Query(value = "select * from user u  where u.name =:name and u.user_id=:id", nativeQuery = true)
	public List<User> getUserByNameandId(@Param("name") String name, @Param("id") int id);

}
