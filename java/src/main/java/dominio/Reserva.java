package dominio;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Reserva {
	@Id
	@GeneratedValue
	private Long ReservaID;
	private Date Inicio;
	private Date Fin;
	@ManyToOne
	private Jugador Jugador;
	@ManyToOne
	private Cancha Cancha;
	
	public Long getID () {
		return ReservaID;
	}
	
	public void setInicio (Date Inicio) {
		this.Inicio = Inicio;
	}
	
	public Date getInicio () {
		return Inicio;
	}
	
	public void setFin (Date Fin) {
		this.Fin = Fin;
	}
	
	public Date getFin () {
		return Fin;
	}
	
	public void setJugador (Jugador Jugador) {
		this.Jugador = Jugador;
	}
	
	public Jugador getJugador () {
		return Jugador;
	}
	
	public void setCancha (Cancha Cancha) {
		this.Cancha = Cancha;
	}
	
	public Cancha getCancha () {
		return Cancha;
	}
}
