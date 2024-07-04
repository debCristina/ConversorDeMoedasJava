package Main;
import Excecoes.ErroOpcaoInvalida;
import Modelos.GerenciadorOpcoes;

import Modelos.Menu;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu menu = new Menu();
        GerenciadorOpcoes opcao = new GerenciadorOpcoes();
        Scanner scanner = new Scanner(System.in);

        while (opcao.getOpcaoUsuario() != 7) {
            System.out.println(menu.exibeMenu());
            opcao.setOpcaoUsuario(scanner.nextInt());

            try {

                if (opcao.getOpcaoUsuario() == 7) {
                    System.out.println("Saindo...");
                    break;
                }

                if (opcao.getOpcaoUsuario() >= 1 && opcao.getOpcaoUsuario() <= 6) {
                    System.out.printf("Insira o valor que deseja converter: ");
                    opcao.setValorConversao(scanner.nextDouble());
                }
                System.out.println(opcao.processarOpcaoUsuario());

                System.out.println("Deseja realizar outra conversão? [1]Sim [2]Não");
                int opcaoContinuar = scanner.nextInt();
                if (opcaoContinuar == 2) {
                    System.out.println("Encerrando...");
                    break;
                }
            }catch (ErroOpcaoInvalida e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}