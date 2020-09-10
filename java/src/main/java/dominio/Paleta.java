package dominio;
import javax.persistence.*;

@Entity
public class Paleta {
	@Id
	@GeneratedValue
	private Long PaletaID;
	private String Nombre;
	private Double Grosor;
	@ManyToOne
	private Color Color;
	@ManyToOne
	private Constructor Constructor;
	
	public Long getID () {
		return PaletaID;
	}
	
	public void setNombre (String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getNombre () {
		return Nombre;
	}
	
	public void setGrosor (Double Grosor) {
		this.Grosor = Grosor;
	}
	
	public Double getGrosor () {
		return Grosor;
	}
	
	public void setColor (Color Color) {
		this.Color = Color;
	}
	
	public Color getColor () {
		return Color;
	}
	
	public void setConstructor (Constructor Constructor) {
		this.Constructor = Constructor;
	}
	
	public Constructor getConstructor () {
		return Constructor;
	}
}
