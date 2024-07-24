package com.fhce.emp.controller;

import java.util.List;

import com.fhce.emp.services.EmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.fhce.emp.obj.empleadoObj;

@RestController
@RequestMapping("fhce-egovf-emp/empleado") //develop
//@RequestMapping("biometrico") //production
//@CrossOrigin("http://svfhce.umsa.bo/") //debelop Fhce
@CrossOrigin("http://192.168.31.45:8080/") //debelop house
public class empleadoController {

	private EmpleadoService empleadoService;

	@GetMapping("/listar")
	public List<empleadoObj> listar() {
		return this.empleadoService.listar();
	}

	@GetMapping("/getListaEmpleado")
	public ResponseEntity<List<empleadoObj>> getListaEmpleado(@RequestParam(value = "tipo") Long tipo) {
		List<empleadoObj> lE = this.empleadoService.getListaEmpleado(tipo);
		if (lE.isEmpty())
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(lE);
	}

	@PostMapping("/addEmpleado")
	public void addEmpleado(@RequestBody empleadoObj empleadoObj) throws Exception {
		this.empleadoService.addEmpleado(empleadoObj);
	}

	@PutMapping("/updateEmpleado")
	public void updateEmpleado(@RequestBody empleadoObj empleadoObj) throws Exception {
		this.empleadoService.updateEmpleado(empleadoObj);
	}

	@GetMapping("/getEmpleado")
	public empleadoObj getEmpleado(@RequestParam(value = "cif") Long cif) {

		return this.empleadoService.getEmpleado(cif);
	}
}