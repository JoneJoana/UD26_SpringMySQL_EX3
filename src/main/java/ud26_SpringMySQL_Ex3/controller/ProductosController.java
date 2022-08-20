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

import ud26_SpringMySQL_Ex3.dto.Productos;
import ud26_SpringMySQL_Ex3.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	ProductosServiceImpl productosServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listProductos(){
		return productosServiceImpl.listProductos();
	}
	
	
	@PostMapping("/productos")
	public Productos saveProductos(@RequestBody Productos Productos) {		
		return productosServiceImpl.saveProductos(Productos);
	}
	
	
	@GetMapping("/productos/{id}")
	public Productos ProductosByID(@PathVariable(name="id") int id) {	
		return productosServiceImpl.ProductosByID(id);
	}
	
	@PutMapping("/productos/{id}")
	public Productos updateProductos(@PathVariable(name="id")int id,@RequestBody Productos Productos) {
		
		Productos Productos_seleccionado= new Productos();		
		Productos_seleccionado= productosServiceImpl.ProductosByID(id);		
		Productos_seleccionado.setNombre(Productos.getNombre());
		Productos_seleccionado.setPrecio(Productos.getPrecio());
		
		return productosServiceImpl.saveProductos(Productos_seleccionado);			
	}
	
	@DeleteMapping("/productos/{id}")
	public void deleteProductos(@PathVariable(name="id")int id) {
		productosServiceImpl.deleteProductos(id);
	}
}
