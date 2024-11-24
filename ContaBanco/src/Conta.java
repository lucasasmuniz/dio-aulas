import java.util.ArrayList;
import java.util.List;

import exceptions.SaldoInsuficienteException;

public abstract class Conta {
    
    private static int NUMERO_CONTA = 1;
    private static final int AGENCIA = 1;

    protected Double saldo;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;
    protected List<String> extrato;
    
    public Conta(Cliente cliente) {
        this.numero = NUMERO_CONTA++;
        this.agencia = AGENCIA;
        this.cliente = cliente;
        this.extrato = new ArrayList<>();
        this.saldo = 0.0;
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.extrato.add("-"+ valor);
        }else{
            throw new SaldoInsuficienteException();
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        this.extrato.add("+"+ valor);
    }
    public void transferir(double valor, Conta contaDestinataria){
        try {
            this.sacar(valor);
            contaDestinataria.depositar(valor);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
    public void imprimirExtrato(){
        System.out.println(this.extrato);
    }
}
