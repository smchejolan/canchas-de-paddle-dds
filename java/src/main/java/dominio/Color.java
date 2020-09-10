package dominio;

import javax.persistence.*;

@Entity
public class Color {
	@Id
	@GeneratedValue
	private Long ColorID;
	private String Descripcion;
	
	public Long getID () {
		return ColorID;
	}
	
	public void setDescripcion (String Descripcion) {
		this.Descripcion = Descripcion;
	}
	
	public String getDescripcion () {
		return Descripcion;
	}
}
