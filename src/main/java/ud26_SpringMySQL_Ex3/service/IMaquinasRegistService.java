package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import ud26_SpringMySQL_Ex3.dto.MaquinasRegist;

public interface IMaquinasRegistService {

	// Metodos del CRUD
	public List<MaquinasRegist> listMaqRegist(); 

	public MaquinasRegist saveMaq_Regist(MaquinasRegist maquinasRegist); 

	public MaquinasRegist Maq_RegistByID(int id); 

	public void deleteMaq_Regist(int id);
}
