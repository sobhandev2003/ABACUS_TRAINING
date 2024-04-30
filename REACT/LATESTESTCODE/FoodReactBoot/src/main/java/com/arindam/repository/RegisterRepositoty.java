package com.arindam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.model.Register;
@Repository
public interface RegisterRepositoty extends JpaRepository<Register,String> {
	@Query("from Register where uname=:uname and pass=:pass")
public Register login(String uname,String pass);
}
