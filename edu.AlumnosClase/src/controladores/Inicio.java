package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDtos;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<AlumnoDtos>listaAlumnos = new ArrayList<AlumnoDtos>();
		
		MenuInterfaz me = new MenuImplementacion();
		
		OperativaInterfaz op = new OperativaImplementacion();
		
		byte seleccionUsuario = 0;
		
		boolean esCerrar = false;
		
		do {
			try {
					
			 seleccionUsuario = me.menuInicial();
			
			switch (seleccionUsuario) {
				case 0:
					
					System.out.println("Se cerrara la aplicacion");
					esCerrar = true;
					break;
	
				case 1:
					System.out.println("Se dara de alta a un nuevo usuario");
					op.altaUsuario(listaAlumnos);
					break;
					
				case 2:
					System.out.println("Se modificara un usuario");
					op.modificarUsuario(listaAlumnos);
					break;
					
				case 3:
					System.out.println("Se eliminara un usuario");
					op.eliminarAlumno(listaAlumnos);
					break;
					
				default:
					System.out.println("[ALERT] -> SELECCION NO VALIDA");
					break;
				}
			}
			
			catch (Exception e) {
				System.out.print("[ALERT] -> SE HA PRODUCIDO UN ERROR" );
			}
			
			
		} while (!esCerrar);
		
	}

}
