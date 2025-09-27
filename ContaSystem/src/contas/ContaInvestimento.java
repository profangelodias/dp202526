package contas;

public class ContaInvestimento extends Conta{
    private double taxa;
    private int prazo;

    public ContaInvestimento(String nome, double taxa, int prazo) {
        super(nome);
        this.taxa = taxa;
        this.prazo = prazo;
    }

    public void aplicaRendimento(double taxa) {
        setSaldo( getSaldo() * taxa);
    }

    public void sacar(double val) {
        if (val > 0 && getSaldo() >= val) {
//            setSaldo(getSaldo() - val * 1.0001);
            super.sacar(val * 1.0001);
            System.out.println("Saldo sacado!");;
        }
        System.out.println("Saldo indisponível!");;
    }

    @Override
    public void depositar(double val) {
        super.depositar(val);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "taxa=" + taxa +
                ", prazo=" + prazo +
                '}';
    }
}
