package db;

import static org.junit.Assert.*;

import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

import dominio.Color;
import repositorios.RepoColores;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

	@Test
	public void contextUp() {
		assertNotNull(entityManager());
	}

	@Test
	public void contextUpWithTransaction() throws Exception {
		withTransaction(() -> {});
	}
	
	@Test
	public void AgregarUnColorALaBase() throws Exception {
		RepoColores repo = new RepoColores();		
		Color rojo = new Color();
		rojo.setDescripcion("Rojo");

		entityManager().persist(rojo);
		
		assertNotNull(rojo.getID());
		
		Color azul = new Color();
		azul.setDescripcion("Azul");
		
		repo.registrar(azul);
		
		assertNotNull(azul.getID());
		
		repo.todos();
	}
}
