package AulaOrientacaoObj;

import java.util.Scanner;

public class Aviao {
	public static void main(String[]args) {
		Voo v1 = new Voo();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		v1.setNome(leia.nextLine());
		System.out.println("Digite o numero do seu voo");
		v1.setNumeroVoo(leia.nextInt());
		leia.nextLine();
		System.out.println("Digite o local do voo");
		v1.setOrigem(leia.nextLine());
		System.out.println("Digite o destino do voo");
		v1.setDestino(leia.nextLine());
		
		System.out.println("Voo marcado! Gostaria de consulta-lo [S-sim/N-não]");
		char resposta = leia.next().charAt(0);
		if (resposta == 'S'|| resposta == 's') {
			System.out.println("Nome:"+v1.getNome());
			System.out.println("Numero do voo:"+v1.getNumeroVoo());
			System.out.println("Local de origem:"+v1.getOrigem());
			System.out.println("Local de destino:"+v1.getDestino());
		}
		else {
			System.out.println("Ok! tenha uma boa viagem");
		}
		leia.close();
	}
}
