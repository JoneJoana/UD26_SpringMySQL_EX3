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

import ud26_SpringMySQL_Ex3.dto.MaquinasRegist;
import ud26_SpringMySQL_Ex3.service.MaquinasRegistServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaRegistController {
	
	@Autowired
	MaquinasRegistServiceImpl maquinasRegistradorasServiceImpl;
	
	@GetMapping("/maquinas_registradoras")
	public List<MaquinasRegist> listMaqRegist(){
		return maquinasRegistradorasServiceImpl.listMaqRegist();
	}
	
	
	@PostMapping("/maquinas_registradoras")
	public MaquinasRegist saveMaq_Regist(@RequestBody MaquinasRegist maquinasRegist) {		
		return maquinasRegistradorasServiceImpl.saveMaq_Regist(maquinasRegist);
	}
	
	
	@GetMapping("/maquinas_registradoras/{id}")
	public MaquinasRegist Maq_RegistByID(@PathVariable(name="id") int id) {
		
		MaquinasRegist Maquinas_Registradoras_xid= new MaquinasRegist();
		
		Maquinas_Registradoras_xid=maquinasRegistradorasServiceImpl.Maq_RegistByID(id);
		
		return Maquinas_Registradoras_xid;
	}
	
	@PutMapping("/maquinas_registradoras/{id}")
	public MaquinasRegist updateMaq_Regist(@PathVariable(name="id")int id,@RequestBody MaquinasRegist maquinasRegist) {
		
		MaquinasRegist MaquinaRegist= new MaquinasRegist();
		
		MaquinaRegist = maquinasRegistradorasServiceImpl.Maq_RegistByID(id);		
		
		MaquinaRegist.setPiso(maquinasRegist.getPiso());
		
		return maquinasRegistradorasServiceImpl.saveMaq_Regist(maquinasRegist);
	}
	
	@DeleteMapping("/maquinas_registradoras/{id}")
	public void deleteMaq_Regist(@PathVariable(name="id")int id) {
		maquinasRegistradorasServiceImpl.deleteMaq_Regist(id);
	}

}
