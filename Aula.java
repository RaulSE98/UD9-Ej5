import java.util.Random;
public class Aula {
	
	
		private int id;
		private Profesor profe;
		private Estudiante[] est;
		private String materia;
		
		private final int NUM_MAX = 30;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public String getMateria() {
			return materia;
		}
		public void setMateria(String materia) {
			this.materia = materia;
		}
		
		
		public Aula () {
			this.id = 1;
			this.profe = new Profesor();
			this.est = new Estudiante[NUM_MAX];
			generarEstudiante();
			this.materia = generarMateria();
		}
		
		@Override
		public String toString() {
			return "Aula [id=" + id + ", materia=" + materia + "]";
		}
		
		
		private void generarEstudiante() {
			int i;
			for (i = 0; i < est.length; i++) {
				est[i] = new Estudiante();
			}
		}
		
		
		private String generarMateria() {
			Random rnd = new Random();
			String[] nombreMateria = {"Matematicas", "Filosofia", "Fisica"};
			return nombreMateria[(int) (rnd.nextDouble() * nombreMateria.length)];
		}
		
		
		private boolean faltaAlumnos() {
			int cont = 0, i;
			
			for (i = 0; i < est.length; i++) {
				if (est[i].isFalta()) {
					cont++;
				}
			}
			System.out.println("Faltan " + cont + " alumnos");
			
			return cont >= ((int) (est.length / 2)); 
		}
		
		
		public boolean darClase() {
			boolean sePuede = true;
			
			if (profe.isFalta()) {
				System.out.println("El profesor falta");
				sePuede = false;
			}
			else if (!profe.getMateria().equals(materia)) {
				System.out.println("Las materias del profesor y del aula no son la misma");
				sePuede = false;
			}
			else if (faltaAlumnos()) {
				System.out.println("Falta mas del 50% de los alumnos");
				sePuede = false;
			}
			
			return sePuede;
		}

}
