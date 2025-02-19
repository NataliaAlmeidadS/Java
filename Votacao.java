package school.sptech;

import java.util.Random;

public class Votacao {
    public static void main(String[] args) {
        Random random = new Random();
        int mussarela = 0;
        int calabresa = 0;
        int quatroQueijos = 0;

        for (int i = 0; i < 10; i++) {
            int voto = random.nextInt(3) + 1;
            switch (voto) {
                case 1:
                    mussarela++;
                    break;
                case 2:
                    calabresa++;
                    break;
                case 3:
                    quatroQueijos++;
                    break;
            }
        }

        System.out.println("Mussarela: " + mussarela + " votos");
        System.out.println("Calabresa: " + calabresa + " votos");
        System.out.println("Quatro Queijos: " + quatroQueijos + " votos");

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("O sabor favorito é Mussarela!");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("O sabor favorito é Calabresa!");
        } else {
            System.out.println("O sabor favorito é Quatro Queijos!");
        }
    }
}
