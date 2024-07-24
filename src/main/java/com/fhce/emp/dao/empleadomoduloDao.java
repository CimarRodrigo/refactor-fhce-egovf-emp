package com.fhce.emp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fhce.emp.model.empleadomoduloModel;
import com.fhce.emp.model.moduloModel;

public interface empleadomoduloDao extends JpaRepository<empleadomoduloModel, Long>{
	@Query(value = "select * from empleadomodulo where _01cif=?",nativeQuery=true)
	List<empleadomoduloModel>getCif(Long cif);
	
	@Query(value = "select * from empleadomodulo where _01cif=? and _03estado = 1",nativeQuery=true)
	List<empleadomoduloModel>getListaModuloEmpleado(Long cif);
	
	@Query(value = "select * from empleadomodulo where _01cif=?",nativeQuery=true)
	empleadomoduloModel getEmpleadoModulo(Long cif);

}
