package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ud26_SpringMySQL_Ex3.dao.ICajerosDAO;
import ud26_SpringMySQL_Ex3.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{

	@Autowired
	ICajerosDAO iCajeroDAO;
	

	@Override
	public List<Cajeros> listCajeros() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajeros saveCajero(Cajeros cajeros) {
		return iCajeroDAO.save(cajeros);
	}

	@Override
	public Cajeros CajeroByID(int id) {
		return iCajeroDAO.findById(id).orElse(null);
	}

	
	@Override
	public void deleteCajero(int id) {		
		iCajeroDAO.deleteById(id);
	}
	
}
