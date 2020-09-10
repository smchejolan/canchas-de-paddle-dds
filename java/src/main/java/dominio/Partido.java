package dominio;
import javax.persistence.*;

@Entity
public class Partido {
	@Id
	@GeneratedValue
	private Long PartidoID;
	@ManyToOne
	private Cancha Cancha;
	@OneToOne
	private Reserva Reserva;
	@ManyToOne
	private Color Color;
	
	public Long getID () {
		return PartidoID;
	}
	
	public void setCancha (Cancha Cancha) {
		this.Cancha = Cancha;
	}
	
	public Cancha getCancha () {
		return Cancha;
	}
	
	public void setReserva (Reserva Reserva) {
		this.Reserva = Reserva;
	}
	
	public Reserva getReserva () {
		return Reserva;
	}
	
	public void setColor (Color Color) {
		this.Color = Color;
	}
	
	public Color getColor () {
		return Color;
	}
}
