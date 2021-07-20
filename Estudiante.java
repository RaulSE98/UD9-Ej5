import java.util.Random;


public class Estudiante extends Persona{

	
		private int nota;

		
		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}

		
		public Estudiante () {
			super();
			this.edad = edad();
			this.nota = nota();
			this.falta = ausencia();
		}

		@Override
		public String toString() {
			return "Estudiante [nota=" + nota + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", falta="
					+ falta + "]";
		}

		
		public boolean ausencia() {
			Random rnd = new Random();
			boolean falta = false;
			
			
			if ((int) (rnd.nextDouble() * 10 + 1) > 5) {
				falta = true;
			}
			
			return falta;
		}
		
		public int nota () {
			Random rnd = new Random();
			return (int) (rnd.nextDouble() * 11); 
		}
		
		public int edad() {
			Random rnd = new Random();
			return (int) (rnd.nextDouble() * 5 + 12);
		}
}
