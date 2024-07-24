package com.fhce.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fhce.emp.dao.empleadomoduloDao;
import com.fhce.emp.model.empleadomoduloModel;

@RestController
@RequestMapping("fhce-egovf-emp/empmodulo") //RequestMapping for Develop
//@RequestMapping("/fhce") // RequestMapping for Production
//@CrossOrigin("http://svfhce.umsa.bo/") //debelop Fhce
@CrossOrigin("http://192.168.31.45:8080/") //debelop house

public class empleadomoduloController {
	
	@Autowired
	private empleadomoduloDao empleadomoduloDao;
	
	@PostMapping("/addEmpleadoModulo")
	public void addHorario(@RequestBody empleadomoduloModel empleadomoduloModel) {
		this.empleadomoduloDao.save(empleadomoduloModel);
	}

}
