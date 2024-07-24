package com.fhce.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoempleado")
public class tipoempleadoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true,nullable = false)
	private Long id;
	
	@Column
	private String _01detalle;
	
	@Column
	private String _02corto;
	
	@Column
	private String _03imagen;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String get_01detalle() {
		return _01detalle;
	}

	public void set_01detalle(String _01detalle) {
		this._01detalle = _01detalle;
	}

	public String get_02corto() {
		return _02corto;
	}

	public void set_02corto(String _02corto) {
		this._02corto = _02corto;
	}

	public String get_03imagen() {
		return _03imagen;
	}

	public void set_03imagen(String _03imagen) {
		this._03imagen = _03imagen;
	}
	
	
}
