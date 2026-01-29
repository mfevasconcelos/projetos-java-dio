public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nome) {
        super(nome);
    }
    
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        System.out.println();
        super.imprimirInfos();
    }
}
