package dominio;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Jugador {
	@Id
	@GeneratedValue
	private Long JugadorID;
	private String Nombre;
	private String Apellido;
	private Date Nacimiento;
	private String Direccion;
	
	@OneToOne
	private Paleta Paleta;
	
	public Long getID () {
		return JugadorID;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre () {
		return Nombre;
	}
	
	public void setApellido (String Apellido) {
		this.Apellido = Apellido;
	}
	
	public String getApellido () {
		return Apellido;
	}
	
	public void setNacimiento (Date Nacimiento) {
		this.Nacimiento = Nacimiento;
	}
	
	public Date getNacimiento () {
		return Nacimiento;
	}
	
	public void setDireccion (String Direccion) {
		this.Direccion = Direccion;
	}
	
	public String getDireccion () {
		return Direccion;
	}
	
	public void setPaleta (Paleta Paleta) {
		this.Paleta = Paleta;
	}
	
	public Paleta getPaleta () {
		return Paleta;
	}
}
