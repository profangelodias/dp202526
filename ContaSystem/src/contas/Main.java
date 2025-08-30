package contas;

public class Main {

    public static void main(String[] args) {

        // 1. Coleta os dados de Conta no código (hard code)
        Conta minhaConta = new Conta();
        minhaConta.numero = 1234;
        minhaConta.nome = "João da Silva";
        minhaConta.saldo = 500.0;
        minhaConta.limite = 1000.0;

        // 2. Imprime os dados coletados
        System.out.println("--- Dados Iniciais da Conta ---");
        System.out.println("Número: " + minhaConta.numero);
        System.out.println("Titular: " + minhaConta.nome);
        System.out.println("Saldo: " + minhaConta.saldo);
        System.out.println("Limite: " + minhaConta.limite);
        System.out.println("-------------------------------");

        // 3. Chama a função sacar, passando um valor qualquer
        double valorSaque = 150.0;
        System.out.println("\nTentando sacar R$ " + valorSaque);
        minhaConta.sacar(valorSaque);

        // 4. Imprime o novo saldo
        System.out.println("--- Dados da Conta Após o Saque ---");
        System.out.println("Novo Saldo: " + minhaConta.saldo);
        System.out.println("-----------------------------------");
    }
}