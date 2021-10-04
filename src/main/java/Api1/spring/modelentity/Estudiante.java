package Api1.spring.modelentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Long promedio;
	@Column
	private String carrera;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getPromedio() {
		return promedio;
	}
	public void setPromedio(Long promedio) {
		this.promedio = promedio;
	}
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}