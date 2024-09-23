package servicios;

import java.util.List;

import dtos.AlumnoDtos;

public interface OperativaInterfaz {

	/**
	 * Da de alta a los alumnos
	 * @param listaAlumnos
	 */
	public void altaUsuario(List<AlumnoDtos> listaAlumnos);
	
	/**
	 * Modifica los datos de los alumnos
	 * @param listaAlumnos
	 */
	public void modificarUsuario(List<AlumnoDtos> listaAlumnos);

	
	public void eliminarAlumno(List<AlumnoDtos>listaAlumnos);
	
}
