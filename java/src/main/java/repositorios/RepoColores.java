package repositorios;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Color;


public class RepoColores implements WithGlobalEntityManager {

	public void registrar(Color Color) {
		entityManager().persist(Color);
	}

	@SuppressWarnings("unchecked")
	public List<Color> todos() {
		return entityManager()
				.createQuery("from Color")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Color> filtrarPorDescripcion(String descripcion) {
		return entityManager()
				.createQuery("from Color where Descripcion = :Descripcion")
				.setParameter("Descripcion", descripcion)
				.getResultList();
	}

}