public abstract class Conta extends IConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente){

        this.agencia=Conta.AGENCIA_PADRAO;
        this.numero=SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    void depositar(double valor) {
        saldo += valor;
    }

    @Override
    void transferir(double valor, Conta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    // Emcapsulamento get/set

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void informacoesComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",agencia));
        System.out.println(String.format("Conta: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }


}