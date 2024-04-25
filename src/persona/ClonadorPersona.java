package persona;

import java.util.ArrayList;
import java.util.List;

public class ClonadorPersona {

	private String nombre;
	
	public ClonadorPersona(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Persona> clonar(){
		
		List<Persona> clones = new ArrayList<Persona>();
		for(int i=0;i<=10;i++) {
			int edad = (int)(Math.random()*100);
			int peso = (int)(Math.random()*101);
			int altura = (int)(Math.random()*201);
			
			clones.add(new Persona(nombre, edad, peso, altura));
		}
		
		return clones;
	}
	
}
