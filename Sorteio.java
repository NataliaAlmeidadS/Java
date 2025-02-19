package school.sptech;

import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Random random = new Random();
        int escolhido = random.nextInt(100) + 1;
        int primeiraOcorrencia = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 200; i++) {
            int sorteio = random.nextInt(100) + 1;

            if (sorteio == escolhido && primeiraOcorrencia == 0) {
                primeiraOcorrencia = i;
            }

            if (sorteio % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("O número foi sorteado pela 1ª vez na posição: " + primeiraOcorrencia);
        System.out.println("Quantidade de números pares sorteados: " + pares);
        System.out.println("Quantidade de números ímpares sorteados: " + impares);
    }
}
