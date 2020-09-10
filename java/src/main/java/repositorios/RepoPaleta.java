package repositorios;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Paleta;

public class RepoPaleta implements WithGlobalEntityManager {

	public void registrar(Paleta Paleta) {
		entityManager().persist(Paleta);
	}

	@SuppressWarnings("unchecked")
	public List<Paleta> todos() {
		return entityManager()
				.createQuery("from Paleta")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Paleta> filtrarPorNombre(String nombre) {
		return entityManager()
				.createQuery("from Paleta where Nombre = :Nombre")
				.setParameter("Nombre", nombre)
				.getResultList();
	}
}
