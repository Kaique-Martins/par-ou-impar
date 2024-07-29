import java.util.Random;
import java.util.Scanner;

class ParOuImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Bem-vindo ao jogo Par ou Ímpar!");

        while (true) {
            System.out.println("Escolha par ou ímpar (digite 'p' para par ou 'i' para ímpar): ");
            String escolhaJogador = entrada.nextLine();

            int numeroComputador = gerador.nextInt(10) + 1; // Número aleatório entre 1 e 10
            System.out.println("O computador escolheu o número " + numeroComputador);

            int soma = numeroComputador; // A soma é o número do computador

            if (escolhaJogador.equalsIgnoreCase("p") && soma % 2 == 0) {
                System.out.println("Você ganhou! A soma é par.");
            } else if (escolhaJogador.equalsIgnoreCase("i") && soma % 2 != 0) {
                System.out.println("Você ganhou! A soma é ímpar.");
            } else {
                System.out.println("Você perdeu! A soma é " + (soma % 2 == 0 ? "par" : "ímpar"));
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            String jogarNovamente = entrada.nextLine();
            if (jogarNovamente.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Obrigado por jogar!");
    }
}