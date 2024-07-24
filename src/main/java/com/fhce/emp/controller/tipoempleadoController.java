package com.fhce.emp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fhce.emp.dao.tipoempleadoDao;
import com.fhce.emp.model.tipoempleadoModel;
import com.fhce.emp.obj.empleadoObj;
import com.fhce.emp.obj.tipoempleadoObj;

@RestController
@RequestMapping("fhce-egovf-emp/tipo") //develop
//@RequestMapping("biometrico") //production
//@CrossOrigin("http://svfhce.umsa.bo/") //debelop Fhce
@CrossOrigin("http://192.168.31.45:8080/") //debelop house
public class tipoempleadoController {
	
	@Autowired
	private tipoempleadoDao tipoempleadoDao;
	
	@GetMapping("/listar")
	public List<tipoempleadoModel> listar(){
		
		return this.tipoempleadoDao.findAll();
	}
	
	
	@GetMapping("/getTipoEmpleado")
	public tipoempleadoObj getTipoEmpleado(@RequestParam (value="id") Long id) {
		
		tipoempleadoModel tipoempleadoModel = this.tipoempleadoDao.getTipoempleado(id);
		tipoempleadoObj tipoempleadoObj = new tipoempleadoObj(tipoempleadoModel.getId(),tipoempleadoModel.get_01detalle(),tipoempleadoModel.get_02corto(),tipoempleadoModel.get_03imagen());
		return (tipoempleadoObj);
	}

}
