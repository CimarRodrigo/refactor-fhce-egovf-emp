package com.fhce.emp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contrato")
public class contratoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true,nullable = false)
	private Long id;
	
	
	@Column
	private Long _01cif;
	
	@Column
	private Long _02empleado_id;
	
	@Column
	private String _03numero_contrato;
	
	@Column
	private String _04servicio;
	
	@Column
	private String _05unidad;
	
	@Column
	private String _06inicio;
	
	@Column
	private String _07fin;
	
	@Column
	private int _08gestion;
	
	@Column
	private String _09detalle;

	public contratoModel(Long id, Long _01cif, Long _02empleado_id, String _03numero_contrato, String _04servicio, String _05unidad, String _06inicio, String _07fin, int _08gestion, String _09detalle) {
		this.id = id;
		this._01cif = _01cif;
		this._02empleado_id = _02empleado_id;
		this._03numero_contrato = _03numero_contrato;
		this._04servicio = _04servicio;
		this._05unidad = _05unidad;
		this._06inicio = _06inicio;
		this._07fin = _07fin;
		this._08gestion = _08gestion;
		this._09detalle = _09detalle;
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

	public Long get_02empleado_id() {
		return _02empleado_id;
	}

	public void set_02empleado_id(Long _02empleado_id) {
		this._02empleado_id = _02empleado_id;
	}

	public String get_03numero_contrato() {
		return _03numero_contrato;
	}

	public void set_03numero_contrato(String _03numero_contrato) {
		this._03numero_contrato = _03numero_contrato;
	}

	public String get_04servicio() {
		return _04servicio;
	}

	public void set_04servicio(String _04servicio) {
		this._04servicio = _04servicio;
	}

	public String get_05unidad() {
		return _05unidad;
	}

	public void set_05unidad(String _05unidad) {
		this._05unidad = _05unidad;
	}

	public String get_06inicio() {
		return _06inicio;
	}

	public void set_06inicio(String _06inicio) {
		this._06inicio = _06inicio;
	}

	public String get_07fin() {
		return _07fin;
	}

	public void set_07fin(String _07fin) {
		this._07fin = _07fin;
	}

	public int get_08gestion() {
		return _08gestion;
	}

	public void set_08gestion(int _08gestion) {
		this._08gestion = _08gestion;
	}

	public String get_09detalle() {
		return _09detalle;
	}

	public void set_09detalle(String _09detalle) {
		this._09detalle = _09detalle;
	}
	
}
