import exceptions.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {
        Cliente jonas = new Cliente("Jonas");
        Cliente velma = new Cliente("Velma");

        Conta cc = new ContaCorrente(velma);
        Conta cp = new ContaPoupanca(jonas);

        cc.depositar(1000);
        cc.sacar(50);
        cp.depositar(20);
        cp.sacar(10);
        cc.transferir(426, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
