package school.sptech;

public class calculoRenda {
    public static void main(String[] args) {
        int filhos0a3 = 2;
        int filhos4a16 = 1;
        int filhos17a18 = 4;

        double totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;

    double bolsa01 = filhos0a3 * 25.12;
    double bolsa02 = filhos4a16 * 15.80;
    double bolsa03 = filhos17a18 * 12.44;

    double totalBolsa = bolsa01 + bolsa02 + bolsa03;

        System.out.println("Você tem um total de " + totalFilhos +" filhos e vai receber R$"+ totalBolsa+" de bolsa");


    }
}
