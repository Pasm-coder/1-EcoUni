package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the empresas_recicladoras database table.
 * 
 */
@Entity
@Table(name="empresas_recicladoras")
@NamedQuery(name="EmpresasRecicladora.findAll", query="SELECT e FROM EmpresasRecicladora e")
public class EmpresasRecicladora implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String direccion;

	@Column(name="email_contacto")
	private String emailContacto;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	private String nombre;

	private String telefono;

	@Column(name="ubicacion_lat")
	private double ubicacionLat;

	@Column(name="ubicacion_long")
	private double ubicacionLong;

	//bi-directional many-to-one association to ContactosEmpresa
	@OneToMany(mappedBy="empresasRecicladora")
	private List<ContactosEmpresa> contactosEmpresas;

	//bi-directional many-to-one association to PuntosReciclaje
	@OneToMany(mappedBy="empresasRecicladora")
	private List<PuntosReciclaje> puntosReciclajes;

	public EmpresasRecicladora() {
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

	public String getEmailContacto() {
		return this.emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public List<ContactosEmpresa> getContactosEmpresas() {
		return this.contactosEmpresas;
	}

	public void setContactosEmpresas(List<ContactosEmpresa> contactosEmpresas) {
		this.contactosEmpresas = contactosEmpresas;
	}

	public ContactosEmpresa addContactosEmpresa(ContactosEmpresa contactosEmpresa) {
		getContactosEmpresas().add(contactosEmpresa);
		contactosEmpresa.setEmpresasRecicladora(this);

		return contactosEmpresa;
	}

	public ContactosEmpresa removeContactosEmpresa(ContactosEmpresa contactosEmpresa) {
		getContactosEmpresas().remove(contactosEmpresa);
		contactosEmpresa.setEmpresasRecicladora(null);

		return contactosEmpresa;
	}

	public List<PuntosReciclaje> getPuntosReciclajes() {
		return this.puntosReciclajes;
	}

	public void setPuntosReciclajes(List<PuntosReciclaje> puntosReciclajes) {
		this.puntosReciclajes = puntosReciclajes;
	}

	public PuntosReciclaje addPuntosReciclaje(PuntosReciclaje puntosReciclaje) {
		getPuntosReciclajes().add(puntosReciclaje);
		puntosReciclaje.setEmpresasRecicladora(this);

		return puntosReciclaje;
	}

	public PuntosReciclaje removePuntosReciclaje(PuntosReciclaje puntosReciclaje) {
		getPuntosReciclajes().remove(puntosReciclaje);
		puntosReciclaje.setEmpresasRecicladora(null);

		return puntosReciclaje;
	}

}