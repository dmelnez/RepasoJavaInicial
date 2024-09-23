package servicios;

/*
 * Servicios que gestionan el menu principal
 * @author dmn
 * 19092024
 * */

public interface MenuInterfaz {

	/*
	 * Metodo encargado de mostrar el menu principal al usuario y solicita la opcion al usuario.
	 * @author dmn
	 * 19092024
	 * @return seleccion del usuario en tipo byte
	 * */
	public byte menuInicial();
	
	public byte menuCampos();
	
}
