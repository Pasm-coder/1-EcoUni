package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the puntos_reciclaje database table.
 * 
 */
@Entity
@Table(name="puntos_reciclaje")
@NamedQuery(name="PuntosReciclaje.findAll", query="SELECT p FROM PuntosReciclaje p")
public class PuntosReciclaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String direccion;

	@Column(name="tipo_material")
	private String tipoMaterial;

	@Column(name="ubicacion_lat")
	private double ubicacionLat;

	@Column(name="ubicacion_long")
	private double ubicacionLong;

	//bi-directional many-to-one association to EmpresasRecicladora
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private EmpresasRecicladora empresasRecicladora;

	public PuntosReciclaje() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public double getUbicacionLat() {
		return this.ubicacionLat;
	}

	public void setUbicacionLat(double ubicacionLat) {
		this.ubicacionLat = ubicacionLat;
	}

	public double getUbicacionLong() {
		return this.ubicacionLong;
	}

	public void setUbicacionLong(double ubicacionLong) {
		this.ubicacionLong = ubicacionLong;
	}

	public EmpresasRecicladora getEmpresasRecicladora() {
		return this.empresasRecicladora;
	}

	public void setEmpresasRecicladora(EmpresasRecicladora empresasRecicladora) {
		this.empresasRecicladora = empresasRecicladora;
	}

}