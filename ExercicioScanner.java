package school.sptech.Metodos;

import java.util.Random;
import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a quantidade de provas que ele fez: ");
        int quantidadeProvas = scanner.nextInt();

        double somaNotas = 0.0;
        for (int i = 1; i <= quantidadeProvas; i++) {
            System.out.print("Digite a nota da prova " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeProvas;
        System.out.printf("Aluno: %s\nMédia: %.2f\n", nomeAluno, media);

        // Exercício 2
        Random random = new Random();

        int numero;
        do {
            System.out.print("Digite um número entre 0 e 100: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 100);

        int sorteios = 0;
        boolean encontrado = false;
        for (int i = 0; i < 200; i++) {
            int sorteio = random.nextInt(101); // Gera número entre 0 e 100
            sorteios++;
            if (sorteio == numero) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            if (sorteios < 10) {
                System.out.println("Você é MUITO sortudo");
            } else if (sorteios <= 50) {
                System.out.println("Você é sortudo");
            } else {
                System.out.println("Melhor parar de apostar e ir trabalhar!");
            }
        } else {
            System.out.println("O número não foi sorteado em 200 tentativas.");
        }

        scanner.close(); // Fechar o scanner corretamente
    }
}
