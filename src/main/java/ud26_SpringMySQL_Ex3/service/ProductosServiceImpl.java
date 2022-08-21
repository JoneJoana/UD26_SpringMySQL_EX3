package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ud26_SpringMySQL_Ex3.dao.IProductosDAO;
import ud26_SpringMySQL_Ex3.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService{
	
	@Autowired
	IProductosDAO iProductosDAO;
	
	@Override
	public List<Productos> listProductos() {
		return iProductosDAO.findAll();
	}

	@Override
	public Productos saveProductos(Productos productos) {
		return iProductosDAO.save(productos);
	}

	@Override
	public Productos ProductosByID(int id) {
		return iProductosDAO.findById(id).orElse(null);
	}

	@Override
	public void deleteProductos(int id) {
		iProductosDAO.deleteById(id);
	}

}