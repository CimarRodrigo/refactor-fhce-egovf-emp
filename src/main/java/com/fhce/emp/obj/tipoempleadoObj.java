package com.fhce.emp.obj;

public class tipoempleadoObj {
	
	private Long id;
	private String detalle;
	private String corto;
	private String foto;
	public tipoempleadoObj(Long id, String detalle, String corto, String foto) {
		this.id = id;
		this.detalle = detalle;
		this.corto = corto;
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getCorto() {
		return corto;
	}
	public void setCorto(String corto) {
		this.corto = corto;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

}
