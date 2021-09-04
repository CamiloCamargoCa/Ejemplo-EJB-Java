package servidor;

import java.util.ArrayList;
import javax.ejb.Stateless;

@Stateless(name="servicioConsulta")
public class ServidorImpl implements Servidor,Imagenes {
	
	private static ArrayList<Empleado> listPersonas(){
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado(1,"Juan Perez","jp@mail.com","Administrador",2500));
		lista.add(new Empleado(2,"Maria Sanchez","ms@mail.com","Diseñadora",2500));
		lista.add(new Empleado(3,"Jorge Florez","jf@mail.com","Tecnico",2500));
		lista.add(new Empleado(4,"Carlos Lopez","cl@mail.com","Colaborador",2500));
		lista.add(new Empleado(5,"Ricardo Roman","rr@mail.com","Mensajero",2500));
		
		return lista;
	}
	
	private static String img(int id) {
		String op=null;
		switch (id) {
		case 1: {
			op=IMG_1;break;	
		}
		case 2: {
			op=IMG_2;break;	
		}
		case 3: {
			op=IMG_3;break;	
		}
		case 4: {
			op=IMG_4;break;	
		}
		case 5: {
			op=IMG_5;break;	
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + id);
		}
		
		return op;
	}
	
	private static String[] getPersonas(int id) {
		String[] resultado = new String[5];
		resultado[0]="<img src="+img(listPersonas().get(id-1).getClave())+" width=270 height=200 />";
		resultado[1]="Nombre: "+listPersonas().get(id-1).getNombre();
		resultado[2]="Correo: "+listPersonas().get(id-1).getCorreo();
		resultado[3]="Cargo: "+listPersonas().get(id-1).getCargo();
		resultado[4]="Sueldo: "+listPersonas().get(id-1).getSueldo();
		return resultado;
	}
	
	@Override
	public String[] consultar(int id) {
		// TODO Auto-generated method stub
		if (id<(listPersonas().size()+1)) {
			return getPersonas(id);
		}else {
			String[] vacio = new String[5];
			vacio[0] = "No existen datos de empleado para este Id";
			vacio[1] = vacio[2] = vacio[3] = vacio[4] = "";
			return vacio;
		}
	}

}
