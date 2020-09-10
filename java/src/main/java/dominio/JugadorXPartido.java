package dominio;
import javax.persistence.*;

@Entity
public class JugadorXPartido {
	@Id
	@GeneratedValue
	private Long JugadorXPartido;
	@ManyToOne
	private Partido Partido;
	@ManyToOne
	private Jugador Jugador;
	@ManyToOne
	private Paleta Paleta;
	
	public Long getID () {
		return JugadorXPartido;
	}
	
	public void setPartido (Partido Partido) {
		this.Partido = Partido;
	}
	
	public Partido getPartido () {
		return Partido;
	}
	
	public void setJugador (Jugador Jugador) {
		this.Jugador = Jugador;
	}
	
	public Jugador getJugador () {
		return Jugador;
	}
	
	public void setPaleta (Paleta Paleta) {
		this.Paleta = Paleta;
	}
	
	public Paleta getPaleta () {
		return Paleta;
	}
}
