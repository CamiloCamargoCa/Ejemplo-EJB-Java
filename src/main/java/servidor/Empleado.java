package servidor;

public class Empleado {
	
	private int clave;
	private String nombre;
	private String correo;
	private String cargo;
	private int sueldo;
	
	public Empleado(int clave, String nombre, String correo, String cargo, int sueldo) {
		this.clave = clave;
		this.nombre = nombre;
		this.correo = correo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
