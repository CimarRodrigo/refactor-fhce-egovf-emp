package com.fhce.emp.obj;


public class contratoObj {
	
	private Long id;

	private Long cif;
	private String numeroContrato;
	private Long empleado_id;
	private String servicio;
	private String unidad;
	private String inicio;
	private String fin;
	private int gestion;
	private String detalle;
	
	public contratoObj(Long id, String numeroContrato, String servicio, String unidad,
			String inicio, String fin, int gestion, String detalle) {
		this.id = id;
		this.numeroContrato = numeroContrato;
		this.servicio = servicio;
		this.unidad = unidad;
		this.inicio = inicio;
		this.fin = fin;
		this.gestion = gestion;
		this.detalle = detalle;
	}

	public contratoObj(Long id, Long cif, Long empleado_id ,String numeroContrato, String servicio, String unidad,
					   String inicio, String fin, int gestion, String detalle) {
		this.id = id;
		this.cif = cif;
		this.empleado_id = empleado_id;
		this.numeroContrato = numeroContrato;
		this.servicio = servicio;
		this.unidad = unidad;
		this.inicio = inicio;
		this.fin = fin;
		this.gestion = gestion;
		this.detalle = detalle;
	}

	public Long getCif() {
		return cif;
	}

	public void setCif(Long cif) {
		this.cif = cif;
	}

	public Long getEmpleado_id() {
		return empleado_id;
	}

	public void setEmpleado_id(Long empleado_id) {
		this.empleado_id = empleado_id;
	}

	public contratoObj(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public int getGestion() {
		return gestion;
	}

	public void setGestion(int gestion) {
		this.gestion = gestion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
