package co.edu.uniminuto.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the recompensas database table.
 * 
 */
@Entity
@Table(name="recompensas")
@NamedQuery(name="Recompensa.findAll", query="SELECT r FROM Recompensa r")
public class Recompensa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String descripcion;

	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;

	@Column(name="valor_puntos")
	private int valorPuntos;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	private Usuario usuario;

	public Recompensa() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Timestamp getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getValorPuntos() {
		return this.valorPuntos;
	}

	public void setValorPuntos(int valorPuntos) {
		this.valorPuntos = valorPuntos;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}