package persona;
	
	public class Persona {
	    private String nombre;
	    private int edad;
	    private double peso;
	    private double altura;

	    /**
	     * Constructor con los parametros que hemos establecido
	     * @param nombre
	     * @param edad
	     * @param peso
	     * @param altura
	     */
	    public Persona(String nombre, int edad, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.peso = peso;
	        this.altura = altura;
	    }

	    /**
	     * 
	     * @return el nombre
	     */
	    public String getNombre() {
	        return nombre;
	    }

	    /**
	     * 
	     * @param nombre
	     */
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    /**
	     * 
	     * @return la edad
	     */
	    public int getEdad() {
	        return edad;
	    }

	    /**
	     * 
	     * @param edad
	     */
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    /**
	     * 
	     * @return el peso
	     */
	    public double getPeso() {
	        return peso;
	    }

	    /**
	     * 
	     * @param peso
	     */
	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    /**
	     * 
	     * @return la altura
	     */
	    public double getAltura() {
	        return altura;
	    }

	    /**
	     * 
	     * @param altura
	     */
	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

		@Override
		/**
		 * metodo toString para poder imprimir las personas creadas
		 */
		public String toString() {
			return "Persona [" + nombre + ", " + edad + " años, " + peso + " kg, " + altura + " cm]";
		}

	   
	}

