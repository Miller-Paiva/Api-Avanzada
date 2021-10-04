package Api1.spring.estudianteservice;

import java.util.List;

import Api1.spring.modelentity.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante e);
	public void delete(String nombre);
	public Estudiante encontrarporNombre(String nombre);
}
