import java.util.Random;

public abstract class Persona {

	
		protected String nombre;
		protected int edad;
		protected char sexo;
		protected boolean falta;
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public char getSexo() {
			return sexo;
		}
		public void setSexo(char sexo) {
			this.sexo = sexo;
		}
		public boolean isFalta() {
			return falta;
		}
		public void setFalta(boolean falta) {
			this.falta = falta;
		}
		
		
		public Persona () {
			this.sexo = generarSexo();
			if (sexo == 'H') {
				this.nombre = nombreMasculino();
			}
			else {
				this.nombre = nombreFemenino();
			}
		}
		
		
		private char generarSexo() {
			Random rnd = new Random();
			char[] sex = {'H', 'M'}; 
			
			return sex[(int) (rnd.nextDouble() * sex.length)];
		}
		
		public String nombreMasculino () {
			Random rnd = new Random();
			String[] hombre = {"Jhon", "Alfonso", "Pedrito", "Gustavo"};
			
			return hombre[(int) (rnd.nextDouble() * hombre.length)];
		}
		public String nombreFemenino () {
			Random rnd = new Random();
			String[] mujer = {"Nuria", "Julia", "Sofia", "Carla"};
			
			return mujer[(int) (rnd.nextDouble() * mujer.length)];
		}
}
