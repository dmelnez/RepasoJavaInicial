package dtos;

import java.sql.Date;

public class AlumnoDtos {




	int idAlumno;
	
	String nombre = "aaaaa";
	
	String apellidos = "aaaaa";
	
	String dni = "aaaaa";
	
	String email = "aaaaa";
	
	String telefono = "aaaaa";
	
	//Date fechaNac = new Date(9999/12/31);
	
	String fechaNac = "aaaaa";
	

	
	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}


	public AlumnoDtos() {
		super();
	}

	
	public AlumnoDtos(int idAlumno, String nombre, String apellidos, String dni, String email, String telefono,
			String fechaNac) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
	}


	
	
	
}
