package com.example.demo.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	
	/*
	@Transactional(readOnly = true)
	@Query("SELECT obj FROM Client obj WHERE obj.nome LIKE %:name%")
	Page<Client> search(@Param("name") String name, Pageable pagaRequest);
	*/
}
