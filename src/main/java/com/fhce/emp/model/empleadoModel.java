package com.fhce.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class empleadoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true,nullable = false)
	private Long id;
	
	@Column
	private Long _01cif;
	
	@Column
	private Long _02tipo_empleado_id;
	
	@Column
	private String _03fecha;
	
	@Column
	private int _04estado;
	
	@Column
	private String _05salida;

	public empleadoModel(){}
	public empleadoModel(Long id ,Long cif, Long tipo_e, String fecha, int estado, String salida){
		this.id = id;
		this._01cif = cif;
		this._02tipo_empleado_id = tipo_e;
		this._03fecha = fecha;
		this._04estado = estado;
		this._05salida = salida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long get_01cif() {
		return _01cif;
	}

	public void set_01cif(Long _01cif) {
		this._01cif = _01cif;
	}

	public Long get_02tipo_empleado_id() {
		return _02tipo_empleado_id;
	}

	public void set_02tipo_empleado_id(Long _02tipo_empleado_id) {
		this._02tipo_empleado_id = _02tipo_empleado_id;
	}

	public String get_03fecha() {
		return _03fecha;
	}

	public void set_03fecha(String _03fecha) {
		this._03fecha = _03fecha;
	}

	public int get_04estado() {
		return _04estado;
	}

	public void set_04estado(int _04estado) {
		this._04estado = _04estado;
	}

	public String get_05salida() {
		return _05salida;
	}

	public void set_05salida(String _05salida) {
		this._05salida = _05salida;
	}
	
	
}
