package school.sptech;

public class CalculoTroco {
    public static void main(String[] args) {

        int valorUnitarioProduto = 6;
        int qtdVendido = 4;
        double valorPago = 25.70;

        double troco = valorPago - valorUnitarioProduto * qtdVendido;

        System.out.println("Seu troco será de R$" + troco);

    }
}

//Cálculo de Troco
//Crie uma classe Java que:
//
//Seja avisado.
//Crie uma variável que armazene o valor unitário de um produto.
//Crie uma variável que armazene a quantidade vendida.
//Crie uma variável que armazene o valor pago pelo cliente.
//Calcule e exiba o troco com a seguinte frase:
