package persona;

public class PersonaData {

	public static final int LIMITE_PESO_MIN = 0;
	public static final int LIMITE_PESO_MAX = 90;

	public static final int LIMITE_EDAD_MIN = 0;
	public static final int LIMITE_EDAD_MAX = 85;

	public static final int LIMITE_ALTURA_MIN = 0;
	public static final int LIMITE_ALTURA_MAX = 190;

	public void comprobarPersona(int peso, int edad, int altura) throws Exception {
		if (peso < LIMITE_PESO_MIN || peso > LIMITE_PESO_MAX) {
			throw new Exception("Peso erróneo");
		} else if (edad < LIMITE_EDAD_MIN || edad > LIMITE_EDAD_MAX) {
			throw new Exception("Edad errónea");
		} else if (altura < LIMITE_ALTURA_MIN || altura > LIMITE_ALTURA_MAX) {
			throw new Exception("Altura errónea");
		}
		
	}
}
