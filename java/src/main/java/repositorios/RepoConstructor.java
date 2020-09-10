package repositorios;

import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Constructor;;

public class RepoConstructor implements WithGlobalEntityManager {

	public void registrar(Constructor Constructor) {
		entityManager().persist(Constructor);
	}

	@SuppressWarnings("unchecked")
	public List<Constructor> todos() {
		return entityManager()
				.createQuery("from Constructor")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Constructor> filtrarPorNombre(String Nombre) {
		return entityManager()
				.createQuery("from Constructor where Nombre = :Nombre")
				.setParameter("Nombre", Nombre)
				.getResultList();
	}
}
