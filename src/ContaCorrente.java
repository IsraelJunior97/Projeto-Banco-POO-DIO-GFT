public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    void imprimirExtrato() {
        System.out.println("===Extrato de conta corrente=== ");
        super.informacoesComuns();

    }
}
