package repositorios;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Reserva;

public class RepoReserva implements WithGlobalEntityManager {

	public void registrar(Reserva Reserva) {
		entityManager().persist(Reserva);
	}

	@SuppressWarnings("unchecked")
	public List<Reserva> todos() {
		return entityManager()
				.createQuery("from Reserva")
				.getResultList();
	}
}
