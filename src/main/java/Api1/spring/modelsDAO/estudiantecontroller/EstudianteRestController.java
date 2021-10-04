package Api1.spring.modelsDAO.estudiantecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Api1.spring.estudianteservice.IEstudianteService;
import Api1.spring.modelentity.Estudiante;

@RestController
@RequestMapping("/api")
public class EstudianteRestController {
	@Autowired
	private IEstudianteService Estudianteservice;

	@GetMapping("/Estudiantes")
	public List<Estudiante> listarEstudiantes() {
		return Estudianteservice.findAll();
	}

	@PostMapping("/Estudiantes")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante guardar(@RequestBody Estudiante e) {
		return Estudianteservice.save(e);
	}

	@DeleteMapping("/Estudiantes/{nombre}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable String nombre) {
		Estudianteservice.delete(nombre);
	}

	@GetMapping("/Estudiantes/{nombre}")
	public Estudiante encontraporId(@PathVariable String nombre) {
		return Estudianteservice.encontrarporNombre(nombre);
	}

	@PutMapping("/Estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Estudiante editar(@PathVariable String nombre, @RequestBody Estudiante e) {
		Estudiante actual = Estudianteservice.encontrarporNombre(nombre);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		actual.setPromedio(e.getPromedio());
		actual.setCarrera(e.getCarrera());
		return Estudianteservice.save(actual);
	}
}