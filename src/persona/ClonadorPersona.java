package persona;

import java.util.ArrayList;
import java.util.List;

public class ClonadorPersona {

	private String nombre;

	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}

	ValidadorPersona vp = new ValidadorPersona();

	public List<Persona> clonar() {

		List<Persona> clones = new ArrayList<Persona>();

		for (int i = 1; i <= 10; i++) {
			try {
				int edad = (int) (Math.random() * 100);
				int peso = (int) (Math.random() * 101);
				int altura = (int) (Math.random() * 201);

				vp.isValid(edad,peso,altura);
				clones.add(new Persona(nombre, edad, peso, altura));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return clones;

	}

}
