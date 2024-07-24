package com.fhce.emp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fhce.emp.dao.empleadomoduloDao;
import com.fhce.emp.dao.moduloDao;
import com.fhce.emp.model.empleadomoduloModel;
import com.fhce.emp.model.moduloModel;



@RestController
@RequestMapping("fhce-egovf-emp/modulo") //RequestMapping for Develop
//@RequestMapping("/fhce") // RequestMapping for Production
//@CrossOrigin("http://svfhce.umsa.bo/") //debelop Fhce
@CrossOrigin("http://192.168.31.45:8080/") //debelop house

public class moduloController {
	
	@Autowired
	private moduloDao moduloDao;
	
	@Autowired
	private empleadomoduloDao empleadomoduloDao;
		
	@GetMapping("/listar")
	public List<moduloModel>listar(){
		return(this.moduloDao.findAll());
	}
	
	@GetMapping("/listarEmpleadoModulo")
	public List<moduloModel>listarEmpleadoModulo(@RequestParam (value="cif") Long cif){
		
		List<empleadomoduloModel>listaEmpleadoModulo = empleadomoduloDao.getCif(cif);
		List<Long>modulo = new ArrayList<Long>();
		List<moduloModel>auxModulo = this.moduloDao.findAll();
		List<moduloModel>lista = new ArrayList<moduloModel>();
		int indice=0;
		for(int i=0;i<listaEmpleadoModulo.size();i++)
			modulo.add(listaEmpleadoModulo.get(i).get_02id_modulo());
		
		for(int i=0;i<auxModulo.size();i++) {
			indice=modulo.indexOf(auxModulo.get(i).getId());
			if(indice==-1) {
				lista.add(auxModulo.get(i));
			}
		}
		return(lista);
	}
	
	@GetMapping("/listarEmpleadoModuloCif")
	public List<moduloModel>listarModuloCif(@RequestParam (value="cif") Long cif){
		
		List<empleadomoduloModel>listaEmpleadoModulo = empleadomoduloDao.getListaModuloEmpleado(cif);
		List<moduloModel>lista=new ArrayList<moduloModel>();
		for(int i=0;i<listaEmpleadoModulo.size();i++) {
			lista.add(this.moduloDao.getModulo(listaEmpleadoModulo.get(i).get_02id_modulo()));
		}
		return(lista);
	}

}
