package repositorios;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Cancha;


public class RepoCanchas implements WithGlobalEntityManager {

	public void registrar(Cancha cancha) {
		entityManager().persist(cancha);
	}

	@SuppressWarnings("unchecked")
	public List<Cancha> todos() {
		return entityManager()
				.createQuery("from Cancha")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Cancha> filtrarPorNombre(String nombre) {
		return entityManager()
				.createQuery("from Cancha where Nombre = :Nombre")
				.setParameter("Nombre", nombre)
				.getResultList();
	}
}
