package ud26_SpringMySQL_Ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ud26_SpringMySQL_Ex3.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
