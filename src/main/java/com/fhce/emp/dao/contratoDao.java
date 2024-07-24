package com.fhce.emp.dao;

import java.util.List;

import com.fhce.emp.obj.contratoObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fhce.emp.model.contratoModel;

public interface contratoDao extends JpaRepository<contratoModel, Long>{
	@Query(value = "select * from contrato where _01cif=? and _02empleado_id=?", nativeQuery=true)
	List<contratoObj>getContratos(Long cif, Long empleado);
}
