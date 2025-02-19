package school.sptech;

import java.util.Random;

public class Acumulador {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;
        int sorteio;

        do {
            sorteio = random.nextInt(11);
            soma += sorteio;
        } while (sorteio != 0);

        System.out.println("A soma dos números é " + soma);
    }
}
