package at.marianasoares;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		final int FIM = 0;
		final String NOMEARQ = "contas.txt";
		int opcao = 0;
		
		opcao = menu();
        while (opcao != FIM) {
//            switch (opcao) {
//                case 1: numAlunos = incluir(alunos, numAlunos); 
//                    break;
//                case 2: alterar(alunos, numAlunos); 
//                    break;
//                case 3: numAlunos = excluir(alunos, numAlunos); 
//                    break;
//                case 4: listar(alunos, numAlunos); 
//                    break;
//            }
//            opcao = menu();
        }
		
	}
	
	public static int incluir() {
		
		return 0;
	}
	
	public static int subMenu() {
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		
		if(menu() == 4) {
			do {
				System.out.println("[1] Clientes com saldo negativo");
				System.out.println("[2] Clientes com saldo acima do estipulado");
				System.out.println("[3] Lista de todos os clientes");
				System.out.println("[4] Conta com o saldo mais alto");
				System.out.println("Selecione uma opção: ");
				opcao = entrada.nextInt();
				if ((opcao <= 0) || (opcao > 4)) {
					System.out.println("ERRO! Opção inválida!");
				}
			} while ((opcao > 0) || (opcao <= 4)); 	
		
		}
		return opcao;
	}
	
	public static int menu() {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("[1] Incluir");
            System.out.println("[2] Alterar");
            System.out.println("[3] Excluir");
            System.out.println("[4] Relatório");
            System.out.println("[0] Sair");
            System.out.print("Selecione uma opção: ");
            opcao = entrada.nextInt();
            if ((opcao < 0) || (opcao > 4)) {
                System.out.println("Erro: opção inválida");
            }
        } while ((opcao < 0) || (opcao > 4));    
        return opcao;
    }
	

}
