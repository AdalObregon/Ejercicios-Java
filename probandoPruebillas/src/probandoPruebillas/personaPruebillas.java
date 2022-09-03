package probandoPruebillas;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class personaPruebillas {

	private Persona Persona1 = new Persona("Griselo", "Philip");
	private Persona Persona2 = new Persona("Mussa", "Araña");

	@Test
	void pruebasIndividuales() {
		assertEquals("Griselo", Persona1.getNombre());
		assertEquals("Araña", Persona2.getApellido());
	}

	@Test
	void pruebasGrupales() {
		assertAll("Persona1", () -> assertEquals("Griselo", Persona1.getNombre()),
				() -> assertEquals("Philip", Persona1.getApellido()),
				() -> assertTrue(Persona1.getNombre().contains("Gris")));
	}

	@Test
	void pruevasFuncionLambda() {
		assertAll("Persona", () -> {
			assertEquals("Griselo", Persona1.getNombre());
			assertEquals("Phillip", Persona1.getApellido());
		}, () -> {
			assertEquals("Mussa", Persona2.getNombre());
			assertEquals("Araña", Persona2.getApellido());
		});
	}

}
