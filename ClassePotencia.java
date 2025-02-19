package school.sptech;

public class ClassePotencia {
    public static void main(String[] args) {
        int base = 2;
        int expoente = 5;
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O valor de " + base + " elevado a " + expoente + " é " + resultado);
    }
}
