package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import ud26_SpringMySQL_Ex3.dto.Cajeros;

public interface ICajerosService {

	// Metodos del CRUD
	public List<Cajeros> listCajeros(); 

	public Cajeros saveCajero(Cajeros cajeros); 

	public Cajeros CajeroByID(int id); 

	public void deleteCajero(int id);

}
