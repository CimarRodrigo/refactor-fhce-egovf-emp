package com.fhce.emp.obj;

import java.util.List;

public class empleadoObj {
	
	private Long id;
	private Long cif;
	private Long tipoempleado_id;
	private String empleado;
	private String fecha;
	private int estado;
	private String salida;
	
	private List<contratoObj>contratos;

	public empleadoObj(Long id, Long cif, String empleado, Long tipoempleado_id,  String fecha, int estado, String salida) {
		this.id = id;
		this.cif = cif;
		this.empleado = empleado;
		this.tipoempleado_id=tipoempleado_id;
		this.fecha = fecha;
		this.estado = estado;
		this.salida = salida;
	}

	public empleadoObj(Long id, Long cif, Long tipoempleado_id,  String fecha, int estado, String salida) {
		this.id = id;
		this.cif = cif;
		this.empleado = "";
		this.tipoempleado_id=tipoempleado_id;
		this.fecha = fecha;
		this.estado = estado;
		this.salida = salida;
	}

	public empleadoObj() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCif() {
		return cif;
	}

	public void setCif(Long cif) {
		this.cif = cif;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public List<contratoObj> getContratos() {
		return contratos;
	}

	public void setContratos(List<contratoObj> contratos) {
		this.contratos = contratos;
	}

	public Long getTipoempleado_id() {
		return tipoempleado_id;
	}

	public void setTipoempleado_id(Long tipoempleado_id) {
		this.tipoempleado_id = tipoempleado_id;
	}



}
