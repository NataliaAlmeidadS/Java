package school.sptech;

import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        Random random = new Random();
        int escolhido = random.nextInt(11);
        int sorteio;
        int tentativas = 0;

        do {
            sorteio = random.nextInt(11);
            tentativas++;
            System.out.println("Número sorteado: " + sorteio);
        } while (sorteio != escolhido);

        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo!");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo!");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar!");
        }
    }
}
