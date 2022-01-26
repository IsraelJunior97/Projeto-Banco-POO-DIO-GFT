public class ContaPoupança extends Conta {

public ContaPoupança(Cliente cliente) {
        super(cliente);
        }

@Override
    void imprimirExtrato() {
            System.out.println("===Extrato de conta PoupanÃ§a=== ");
            super.informacoesComuns();

            }


            }