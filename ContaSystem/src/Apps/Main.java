package Apps;

import contas.ContaEspecial;
import contas.ContaInvestimento;

public class Main {
    public static void main(String[] args) {
        // Criando ContaEspecial
        ContaEspecial ce = new ContaEspecial(1, "Maria", 1000);
        ce.depositar(200);
        ce.sacar(1500); // vai usar limite
        System.out.println(ce);

        // Criando ContaInvestimento
        ContaInvestimento ci = new ContaInvestimento("Anjo", 0.02, 12);
        ci.depositar(500);
        ci.sacar(1000);
        ci.aplicaRendimento(0.05); // aplica 5% de rendimento
        System.out.println(ci);
    }
}
