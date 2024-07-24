package com.fhce.emp.controller;

import java.util.List;

import com.fhce.emp.obj.contratoObj;
import com.fhce.emp.services.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fhce.emp.dao.contratoDao;
import com.fhce.emp.dao.empleadoDao;
import com.fhce.emp.dao.empleadomoduloDao;
import com.fhce.emp.model.contratoModel;
import com.fhce.emp.model.empleadoModel;
import com.fhce.emp.model.empleadomoduloModel;

@RestController
@RequestMapping("fhce-egovf-emp/contrato") //develop
//@RequestMapping("biometrico") //production
//@CrossOrigin("http://svfhce.umsa.bo/") //debelop Fhce
@CrossOrigin("http://192.168.31.45:8080/") //debelop house
public class contratoController {
	
	@Autowired
	private contratoDao contratoDao;
	
	@Autowired
	private empleadomoduloDao empleadomoduloDao;
	
	@Autowired
	private empleadoDao empleadoDao;

	@Autowired
	private ContratoService contratoService;
	
	@GetMapping("/listar")
	public List<contratoObj> listar(){
		return this.contratoService.listar();
	}
	
	@PostMapping("/addContrato")
	public void addContrato(@RequestBody contratoObj contratoObj) throws Exception {
		this.contratoService.addContrato(contratoObj);
	}
	
	@GetMapping("/listarContratos")
	public List<contratoObj> listarContratos(@RequestParam (value="cif") Long cif,@RequestParam (value="empleado") Long empleado){
		return this.contratoService.listarContratos(cif, empleado);
	}
	
	@PutMapping("/actualizarContrato")
	public void setContrato(@RequestBody contratoObj contratoObj)throws Exception{
		this.contratoService.setContrato(contratoObj);
	}

}
