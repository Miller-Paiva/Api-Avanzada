package Api1.spring.estudianteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Api1.spring.modelentity.Estudiante;
import Api1.spring.modelsDAO.IEstudianteDAO;

@Service
public class EstudianteService implements IEstudianteService {
	@Autowired
	private IEstudianteDAO Estudiantedao;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return Estudiantedao.findAll();
	}

	@Override
	public Estudiante save(Estudiante e) {
		// TODO Auto-generated method stub
		return Estudiantedao.save(e);
	}

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		Estudiantedao.deleteById(nombre);
	}

	@Override
	public Estudiante encontrarporNombre(String nombre) {
		// TODO Auto-generated method stub
		return Estudiantedao.findById(nombre).orElse(null);
	}

}