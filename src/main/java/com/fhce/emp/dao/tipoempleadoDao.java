package com.fhce.emp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fhce.emp.model.tipoempleadoModel;

public interface tipoempleadoDao extends JpaRepository<tipoempleadoModel, Long>{
	
	@Query(value = "select * from tipoempleado where id=?",nativeQuery=true)
	tipoempleadoModel getTipoempleado(Long id);

}
