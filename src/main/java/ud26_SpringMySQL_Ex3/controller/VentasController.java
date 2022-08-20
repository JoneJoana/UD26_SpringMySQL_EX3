package ud26_SpringMySQL_Ex3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ud26_SpringMySQL_Ex3.dto.Venta;
import ud26_SpringMySQL_Ex3.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listVenta(){
		return ventaServiceImpl.listVenta();
	}
	
	
	@PostMapping("/venta")
	public Venta saveVenta(@RequestBody Venta Venta) {		
		return ventaServiceImpl.saveVenta(Venta);
	}
	
	
	@GetMapping("/venta/{id}")
	public Venta VentaByID(@PathVariable(name="id") int id) {
		return ventaServiceImpl.VentaByID(id);
	}
	
	@PutMapping("/venta/{id}")
	public Venta updateVenta(@PathVariable(name="id")int id,@RequestBody Venta Venta) {
		
		Venta Venta_seleccionado= new Venta();	
		Venta_seleccionado= ventaServiceImpl.VentaByID(id);		
		
		Venta_seleccionado.setCajero(Venta.getCajero());
		Venta_seleccionado.setMaqRegist(Venta.getMaqRegist());
		Venta_seleccionado.setProductos(Venta.getProductos());
				
		return ventaServiceImpl.saveVenta(Venta_seleccionado);
	}
	
	@DeleteMapping("/venta/{id}")
	public void deleteVenta(@PathVariable(name="id")int id) {
		ventaServiceImpl.deleteVenta(id);
	}
}
