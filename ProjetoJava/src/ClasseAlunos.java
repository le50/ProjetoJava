
public class ClasseAlunos {
	String nomeAt; // Abaixo da class é atributo é não var
	float notaAt;
	String cursoAt;
	
	// Método para mostrar nome
	public void mostrarNomeMet() {
		System.out.println(this.nomeAt);
	}
	
	// Método para mostrar nome
		public void mostrarNotaMet() {
			System.out.println(this.notaAt);
		}
		
		// Método para mostrar nome
		public void mostrarCursoMet() {
			System.out.println(this.cursoAt);
		}
		
		public void receberNomeMet(String nomePar) {
			this.nomeAt = nomePar;
		}
		
		public void receberNotaMet(float notaPar) {
			this.notaAt = notaPar;
		}
		
		public void receberCursoMet(String cursoPar) {
			this.cursoAt = cursoPar;
		}
}
