package persona;

public class ValidadorPersona {

	public static boolean isValid(int edad, int peso, int altura) throws Exception {
		boolean devolver = true;
		if (peso < PersonaData.LIMITE_PESO_MIN || peso > PersonaData.LIMITE_PESO_MAX) {
			devolver = false;
			throw new Exception("Peso erróneo");
		} else if (edad < PersonaData.LIMITE_EDAD_MIN || edad > PersonaData.LIMITE_EDAD_MAX) {
			devolver = false;
			throw new Exception("Edad errónea");
		} else if (altura < PersonaData.LIMITE_ALTURA_MIN || altura > PersonaData.LIMITE_ALTURA_MAX) {
			devolver = false;
			throw new Exception("Altura errónea");
		}
			return devolver;
	}
}
