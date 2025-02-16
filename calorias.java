package school.sptech;

public class calorias {
    public static void main(String[] args) {
        int aquecendo = 15;
        int aerobico = 40;
        int musculacao = 60;

        int totalMin = aquecendo + aerobico + musculacao;

        int perdaA = aquecendo * 12;
        int perdaB = aerobico * 20;
        int perdaC = musculacao * 25;

        int totatlCalorias = perdaA + perdaB + perdaC;

        System.out.println("Olá, Jorge. Você fez um total de "+ totalMin  + " minutos de exercícios e perdeu cerca de " + totatlCalorias + " calorias.");
    }
}
