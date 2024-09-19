package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	
	public byte menuInicial() {
		
		System.out.println("SELECCIONE UNA OPCION");
		System.out.println("[0] - Cerrar Aplicacion");
		System.out.println("[1] - Alta nuevo usuario");
		System.out.println("[2] - Modificacion de un alumno");
		System.out.println("[3] - Eliminar un alumno");
		byte seleccionUsuario = sc.nextByte();
		return seleccionUsuario;
		
	}
	
	public byte menuCampos() {
		
		System.out.println("SELECCIONE UNA CAMPO");
		System.out.println("[0] - Nombre");
		System.out.println("[1] - Apellidos");
		System.out.println("[2] - Email");
		System.out.println("[3] - Telefono");
		System.out.println("[4] - Fecha Nacimiento");
		byte seleccionUsuario = sc.nextByte();
		return seleccionUsuario;
		
	}
	
	
}
