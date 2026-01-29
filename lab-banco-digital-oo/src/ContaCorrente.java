public class ContaCorrente extends Conta {

    public ContaCorrente(String nome) {
        super(nome);
    }

    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        System.out.println();
        super.imprimirInfos();
    }
}
