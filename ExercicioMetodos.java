package school.sptech.Metodos;

// Exercicio01
public class ExercicioMetodos {
    public static void main(String[] args) {
        Integer idadeuser = 18;
        System.out.println(verificarMaioridade(idadeuser));
        System.out.println(calcularMedia(2.3, 4.8, 9.5));
        System.out.println(maiorNumero(2, 4, 7));
        System.out.println(calcularFatorial(5));
        System.out.println(verificarPrimo(28,2));
        System.out.println(calcularPotencia(3, 3));
        System.out.println(calcularTrocoemBalas(50.0,70.0));
    }

    public static boolean verificarMaioridade(Integer idade) {
        return idade >= 18;
    }
//Exercicio2
    public  static double calcularMedia(double valor1, double valor2, double valor3){
       return valor1 + valor2 + valor3 / 3;
    }
//Exercicio03
    public  static Integer maiorNumero(Integer valor1, Integer valor2, Integer valor3){
        if (valor1 > valor2 && valor1 > valor3){
            return valor1;
        } else if (valor2 > valor1 && valor2 > valor3) {
            return valor2;
        }else {
            return valor3;
        }
    }
    //Exercicio04
    public  static  Integer calcularFatorial(Integer valor){
        Integer fatorial = 1;
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
// Exercicio05
    public static boolean verificarPrimo(Integer valor,Integer divisor){
        if (valor < 2){
            return false;
        }
        if (divisor * divisor > valor) {
            return true;
        }
        if (valor % divisor == 0) {
            return false;
        }
        return verificarPrimo(valor,divisor + 1);

    }
    //Exercicio06
    public static Integer calcularPotencia(Integer base, Integer expoente){
        Integer potencia = 1;
        for(int i = 0; i < expoente; i++) {
            potencia *= base;
        }
        return potencia;
    }
//Exercicio07
    public static Integer calcularTrocoemBalas(Double valorCompra, Double valorRecebido){
        Double valorBala = 0.25;
        Double troco = valorRecebido - valorCompra;
        int qtdBalas = 0;

        for(; troco >= valorBala; troco -= valorBala){
            qtdBalas++;
        }

        return qtdBalas;
    }



}






