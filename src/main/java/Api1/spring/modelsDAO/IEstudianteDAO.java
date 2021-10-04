package Api1.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Api1.spring.modelentity.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, String> {
	
}