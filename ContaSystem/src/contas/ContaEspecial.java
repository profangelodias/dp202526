package contas;

public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, String nome, double limite) {
        super(numero, nome);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

@Override
    public void sacar(double quantidade) {
        double novoSaldo = getSaldo() - (quantidade * 0.01);
        setSaldo(novoSaldo);
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite + "Nome=" + getNome() + "Numero=" + getNumero() +
                '}';
    }
}
