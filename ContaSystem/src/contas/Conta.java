package contas;

import java.util.Random;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    Random random = new Random();

    public Conta(String nome) {
        this.numero = random.nextInt(1000) + 1;
        this.nome = nome;
        this.saldo = 0;
    }

    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = 0;
    }

    public void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public void depositar(double quantidade) {
        double novoSaldo = this.saldo + quantidade;
        this.saldo = novoSaldo;
    }
    //REGRA DE NEGOCIO

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
