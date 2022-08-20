package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import ud26_SpringMySQL_Ex3.dto.Productos;

public interface IProductosService {

	public List<Productos> listProductos(); 

	public Productos saveProductos(Productos productos); 

	public Productos ProductosByID(int id); 

	public void deleteProductos(int id);
}
