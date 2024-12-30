package tarefa_controle_de_fluxo;

public class Notas {
	
	private float nota1;
	
	private float nota2;
	
	private float nota3;
	
	private float nota4;

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float f) {
		this.nota1 = f;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float f) {
		this.nota2 = f;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float f) {
		this.nota3 = f;
	}

	public float getNota4() {
		return nota4;
	}

	public void setNota4(float f) {
		this.nota4 = f;
	}

	public float calcularMedia() {
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
}
