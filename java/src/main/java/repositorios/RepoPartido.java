package repositorios;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import dominio.Partido;

public class RepoPartido implements WithGlobalEntityManager {

	public void registrar(Partido Partido) {
		entityManager().persist(Partido);
	}

	@SuppressWarnings("unchecked")
	public List<Partido> todos() {
		return entityManager()
				.createQuery("from Partido")
				.getResultList();
	}
}
