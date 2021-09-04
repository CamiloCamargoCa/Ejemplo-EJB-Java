package servidor;

import javax.ejb.Local;

@Local
public interface Servidor {
	public String[] consultar(int id);
}
