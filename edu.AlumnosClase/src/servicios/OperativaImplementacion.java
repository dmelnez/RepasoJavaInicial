package servicios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDtos;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);
		
	public void altaUsuario(List<AlumnoDtos> listaAlumnos) {
		
		AlumnoDtos alum = new AlumnoDtos();
		
		alum.setIdAlumno(autoincrementalId(listaAlumnos)); 
		
		System.out.println("NOMBRE: ");
		
		alum.setNombre(sc.next());
		
		System.out.println("PRIMER APELLIDO: ");
		String apellido1 = sc.next();
		
		System.out.println("SEGUNDO APELLIDO");
		String apellido2 = sc.next();
		
		alum.setApellidos(apellido1 + " " + apellido2);
		
		System.out.println("FECHA NACIMIENTO: ");
		alum.setFechaNac(sc.next());
		
		System.out.println("DNI: ");
		alum.setDni(sc.next());
		
		System.out.println("EMAIL:");
		alum.setEmail(sc.next());
		
		System.out.println("TELEFONO: ");
		alum.setTelefono(sc.next());
		
		listaAlumnos.add(alum);
		

		for(var alumno : listaAlumnos) {
			System.out.println(alumno.getIdAlumno());
			System.out.println(alumno.getNombre());
			System.out.println(alumno.getApellidos());
			System.out.println(alumno.getDni());
			System.out.println(alumno.getEmail());
			System.out.println(alumno.getTelefono());
			System.out.println(alumno.getFechaNac());
		}
	}
	
	
	public void modificarUsuario(List<AlumnoDtos> listaAlumnos) {
		MenuInterfaz mi = new MenuImplementacion();
		
		System.out.println("Inserte DNI del alumno a modificar");
		String dniString = sc.next();
		
		for(var alumno : listaAlumnos) {
			if(dniString.equals(alumno.getDni())) {
				System.out.println(alumno.getIdAlumno());
				System.out.println(alumno.getNombre());
				System.out.println(alumno.getApellidos());
				System.out.println(alumno.getDni());
				System.out.println(alumno.getEmail());
				System.out.println(alumno.getTelefono());
				System.out.println(alumno.getFechaNac());
				
			}
		}
		
		
		switch (mi.menuCampos()) {
			case 0: {
				
				break;
			}
			
			case 1: {
				
				break;
			}
			
			case 2: {
				
				break;
			}
			
			case 3: {
				
				break;
			}
			
			case 4: {
				
				break;
			}
			
			case 5: {
				
				break;
			}
			default:
			
				break;
			}
		
	}
	
	
	//Metodos Privados
	private int autoincrementalId(List<AlumnoDtos> listaAlumnos) {
		
		
		
		int tamanioLista = listaAlumnos.size();
		
		int idCreado = 0;
		
		if(tamanioLista == 0) {
			
			idCreado = 1;
		}
		
		else {
			idCreado = listaAlumnos.get(tamanioLista -1).getIdAlumno() +1;
		}
		
		return idCreado;
	}
	
}
