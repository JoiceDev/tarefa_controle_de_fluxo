package tarefa_controle_de_fluxo;

public class MediaStatus {
	
	public String verificarStatus(float media) {
		if (media < 5) {
			return "Reprovado!";
		} else if (media >= 5 && media < 7) {
			return "Recuperação!";
		} else {
			return "Aprovado!";
			}
		}

public static void main(String[] args) {

	Notas notas = new Notas();

	notas.setNota1(4);
	notas.setNota2(8);
	notas.setNota3(7);
	notas.setNota4(9);
	
	float media = notas.calcularMedia();
	
	MediaStatus mediaStatus = new MediaStatus();
    String status = mediaStatus.verificarStatus(media);

    System.out.println("A média do aluno é: " + media);
    System.out.println("Status do aluno: " + status);
	
}
}