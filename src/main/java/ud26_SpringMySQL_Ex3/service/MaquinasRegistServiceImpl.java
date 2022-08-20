package ud26_SpringMySQL_Ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ud26_SpringMySQL_Ex3.dao.IMaquinasRegistDAO;
import ud26_SpringMySQL_Ex3.dto.MaquinasRegist;

@Service
public class MaquinasRegistServiceImpl implements IMaquinasRegistService{

	@Autowired
	IMaquinasRegistDAO iMaquinasRegistDao;
	
	@Override
	public List<MaquinasRegist> listMaqRegist() {
		return iMaquinasRegistDao.findAll();
	}

	@Override
	public MaquinasRegist saveMaq_Regist(MaquinasRegist maquinasRegist) {
		return iMaquinasRegistDao.save(maquinasRegist);
	}

	@Override
	public MaquinasRegist Maq_RegistByID(int id) {
		return iMaquinasRegistDao.findById(id).get();
	}

	@Override
	public void deleteMaq_Regist(int id) {
		iMaquinasRegistDao.deleteById(id);
	}

}
