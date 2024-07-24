package com.fhce.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleadomodulo")
public class empleadomoduloModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true,nullable = false)
	private Long id;
	
	@Column
	private Long _01cif;
	
	@Column
	private Long _02id_modulo;
	
	@Column
	private int _03estado;

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

	public Long get_02id_modulo() {
		return _02id_modulo;
	}

	public void set_02id_modulo(Long _02id_modulo) {
		this._02id_modulo = _02id_modulo;
	}

	public int get_03estado() {
		return _03estado;
	}

	public void set_03estado(int _03estado) {
		this._03estado = _03estado;
	}
}
