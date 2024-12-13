package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the contactos_empresa database table.
 * 
 */
@Entity
@Table(name="contactos_empresa")
@NamedQuery(name="ContactosEmpresa.findAll", query="SELECT c FROM ContactosEmpresa c")
public class ContactosEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="fecha_contacto")
	private Timestamp fechaContacto;

	@Lob
	private String mensaje;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	//bi-directional many-to-one association to EmpresasRecicladora
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private EmpresasRecicladora empresasRecicladora;

	public ContactosEmpresa() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getFechaContacto() {
		return this.fechaContacto;
	}

	public void setFechaContacto(Timestamp fechaContacto) {
		this.fechaContacto = fechaContacto;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public EmpresasRecicladora getEmpresasRecicladora() {
		return this.empresasRecicladora;
	}

	public void setEmpresasRecicladora(EmpresasRecicladora empresasRecicladora) {
		this.empresasRecicladora = empresasRecicladora;
	}

}