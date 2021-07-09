package AulaOrientacaoObj;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// TODO Auto-generated method stub
		Client c1 = new Client();
		System.out.println("Digite o nome");
		c1.setNome(leia.nextLine());
		System.out.println("Digite a idade");
		c1.setIdade(leia.nextInt());
		leia.nextLine();
		System.out.println("Voce ja é cadastrado");
		c1.setCadastro(leia.nextLine());
		System.out.println("nome:"+c1.getNome());
		System.out.println("Idade :"+c1.getIdade());
		System.out.println("cadastro: "+c1.getCadastro());
		leia.close();
	}

}
