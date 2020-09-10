package dominio;
import javax.persistence.*;

@Entity
public class Constructor {
	@Id
	@GeneratedValue
	private Long ConstructorID;
	private String Nombre;
	private String Direccion;
	
	public Long getID () {
		return ConstructorID;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre () {
		return Nombre;
	}
	
	public void setDireccion (String Direccion) {
		this.Direccion = Direccion;
	}
	
	public String getDireccion () {
		return Direccion;
	}
}
