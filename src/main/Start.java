package main;

import persona.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClonadorPersona clone = new ClonadorPersona("Diego");
		System.out.println(clone.clonar());
	}

}
