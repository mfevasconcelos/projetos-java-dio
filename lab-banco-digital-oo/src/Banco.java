public class Banco {
    public static void main(String[] args) {
       Conta cc = new ContaCorrente("Fernanda");
       Conta poupanca = new ContaPoupanca("Victor");

       cc.depositar(200);
       cc.sacar(15);
       cc.transferir(150, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
