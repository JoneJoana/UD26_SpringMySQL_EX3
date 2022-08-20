package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ud26_SpringMySQL_Ex3.dao.IVentaDAO;
import ud26_SpringMySQL_Ex3.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta saveVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta VentaByID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public void deleteVenta(int id) {
		iVentaDAO.deleteById(id);
	}

}
