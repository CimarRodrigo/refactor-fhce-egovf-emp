package com.fhce.emp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fhce.emp.model.moduloModel;

public interface moduloDao extends JpaRepository<moduloModel, Long>{
	@Query(value = "select * from modulo where id=?",nativeQuery=true)
	moduloModel getModulo(Long id);
}
