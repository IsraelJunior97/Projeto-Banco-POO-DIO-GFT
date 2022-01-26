public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        cc.depositar(100.00d);
        Conta cp = new ContaPoupança(venilton);
        cp.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}