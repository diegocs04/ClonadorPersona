package main;

import java.util.List;

import persona.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClonadorPersona clone = new ClonadorPersona("Diego");
		List<Persona> personas = clone.clonar();
		
		System.out.println(personas);
	}

}
