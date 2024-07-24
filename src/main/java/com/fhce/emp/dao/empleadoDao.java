package com.fhce.emp.dao;

import java.util.List;

import com.fhce.emp.obj.empleadoObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fhce.emp.model.empleadoModel;

public interface empleadoDao extends JpaRepository<empleadoModel, Long>{
	
	@Query(value = "select * from empleado where _01cif=?",nativeQuery=true)
	empleadoModel getEmpleado(Long cif);
	
	@Query(value = "select * from empleado where _02tipo_empleado_id=? and _04estado=?",nativeQuery=true)
	List<empleadoModel> getListaEmpleado(Long tipo, int estado);
}
