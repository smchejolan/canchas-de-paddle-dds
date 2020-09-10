package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cancha {
	@Id
	@GeneratedValue
	private Long CanchaID;
	private Boolean Iluminada;
	private String Nombre;

	@ManyToOne
	private Color Color;
	
	public Long getID () {
		return CanchaID;
	}
	
	public void setColor (Color Color) {
		this.Color = Color;
	}
	
	public Color getColor () {
		return Color;
	}
	
	public void setIluminada (Boolean Iluminada) {
		this.Iluminada = Iluminada;
	}
	
	public Boolean getIluminada () {
		return Iluminada;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre () {
		return Nombre;
	}
}
