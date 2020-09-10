package repositorios;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Jugador;

public class RepoJugadores implements WithGlobalEntityManager {

	public void registrar(Jugador Jugador) {
		entityManager().persist(Jugador);
	}

	@SuppressWarnings("unchecked")
	public List<Jugador> todos() {
		return entityManager()
				.createQuery("from Jugador")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Jugador> filtrarPorNombre(String nombre) {
		return entityManager()
				.createQuery("from Jugador where Nombre = :Nombre")
				.setParameter("Nombre", nombre)
				.getResultList();
	}
}
