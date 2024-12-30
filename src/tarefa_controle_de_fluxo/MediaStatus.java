package tarefa_controle_de_fluxo;

import java.util.Scanner;

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
	
	Scanner scanner = new Scanner(System.in);
	Notas notas = new Notas();

	System.out.println("Digite a primeira nota: ");
    notas.setNota1(scanner.nextFloat());

    System.out.println("Digite a segunda nota: ");
    notas.setNota2(scanner.nextFloat());

    System.out.println("Digite a terceira nota: ");
    notas.setNota3(scanner.nextFloat());

    System.out.println("Digite a quarta nota: ");
    notas.setNota4(scanner.nextFloat());
	
	float media = notas.calcularMedia();
	
	MediaStatus mediaStatus = new MediaStatus();
    String status = mediaStatus.verificarStatus(media);

    System.out.println("A média do aluno é: " + media);
    System.out.println("Status do aluno: " + status);
	
}
}