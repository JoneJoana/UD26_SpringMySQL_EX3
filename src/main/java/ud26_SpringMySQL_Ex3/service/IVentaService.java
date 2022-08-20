package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import ud26_SpringMySQL_Ex3.dto.Venta;

public interface IVentaService {

	public List<Venta> listVenta(); 

	public Venta saveVenta(Venta venta); 

	public Venta VentaByID(int id);  

	public void deleteVenta(int id);
}
