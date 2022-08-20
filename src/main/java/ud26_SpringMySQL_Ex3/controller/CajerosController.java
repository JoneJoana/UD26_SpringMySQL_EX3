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

import ud26_SpringMySQL_Ex3.dto.Cajeros;
import ud26_SpringMySQL_Ex3.service.CajerosServiceImpl;

@RestController
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl cajerosServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> listCajeros(){
		return cajerosServiceImpl.listCajeros();
	}
		
	@PostMapping("/cajeros")
	public Cajeros saveCajeros(@RequestBody Cajeros Cajeros) {
		
		return cajerosServiceImpl.saveCajero(Cajeros);
	}
		
	@GetMapping("/cajeros/{id}")
	public Cajeros CajeroByID(@PathVariable(name="id") int id) {		
		return cajerosServiceImpl.CajeroByID(id);
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajeros updateCajero(@PathVariable(name="id")int id,@RequestBody Cajeros Cajeros) {
		
		Cajeros Cajeros_seleccionado= new Cajeros();		
		Cajeros_seleccionado= cajerosServiceImpl.CajeroByID(id);		
		Cajeros_seleccionado.setNomapels(Cajeros.getNomapels());
		
		return cajerosServiceImpl.saveCajero(Cajeros_seleccionado);
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void deleteCajero(@PathVariable(name="id")int id) {
		cajerosServiceImpl.deleteCajero(id);
	}
}
