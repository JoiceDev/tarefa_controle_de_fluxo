package tarefa_controle_de_fluxo;

public class Notas {
	
	private float nota1;
	
	private float nota2;
	
	private float nota3;
	
	private float nota4;

	public float getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public float getNota4() {
		return nota4;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}

	public float calcularMedia() {
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
}
