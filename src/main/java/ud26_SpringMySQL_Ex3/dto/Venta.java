package ud26_SpringMySQL_Ex3.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajeros cajero;
 
    @ManyToOne
    @JoinColumn(name = "producto")
    Productos producto;
    
    @ManyToOne
    @JoinColumn(name = "maqRegist")
    MaquinasRegist maqRegist;
    
    public Venta() {}

	public Venta(int id, Cajeros cajero, Productos productos, MaquinasRegist maquinasRegist) {
		this.id = id;
		this.cajero = cajero;
		this.producto = productos;
		this.maqRegist = maquinasRegist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajeros getCajero() {
		return cajero;
	}

	public void setCajero(Cajeros cajero) {
		this.cajero = cajero;
	}

	public Productos getProductos() {
		return producto;
	}

	public void setProductos(Productos productos) {
		this.producto = productos;
	}

	public MaquinasRegist getMaqRegist() {
		return maqRegist;
	}

	public void setMaqRegist(MaquinasRegist maqRegist) {
		this.maqRegist = maqRegist;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", producto=" + producto + ", maquina registradora="
				+ maqRegist + "]";
	}

}
