import java.util.Random;


public class Profesor extends Persona{

	
		private String materia;

		
		public String getMateria() {
			return materia;
		}

		public void setMateria(String materia) {
			this.materia = materia;
		}

		
		public Profesor () {
			this.edad = edad();
			this.materia = generarMateria();
			this.falta = ausencia();
		}

		@Override
		public String toString() {
			return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta="
					+ falta + "]";
		}
		
		
		public boolean ausencia() {
			Random rnd = new Random();
			boolean falta = false;
			
			if ((int) (rnd.nextDouble() * 10 + 1) > 8) {
				falta = true;
			}
			
			return falta;
		}
		
		public int edad() {
			Random rnd = new Random();
			return (int) (rnd.nextDouble() * 30 + 20); 
		}
		
		private String generarMateria() {
			Random rnd = new Random();
			
			String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
			
			return nombreMateria[(int) (rnd.nextDouble() * nombreMateria.length)];
		}
}
