public abstract class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    public static int NUMBER = 1;

    public Conta(String cliente) {
        this.cliente = new Cliente(cliente);
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = NUMBER++;
    }

    protected void imprimirInfos() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimirExtrato() {
        imprimirInfos();
    }

    public void depositar(double valor) {
        saldo+=valor;
    }

    public void sacar(double valor) {
        saldo-=valor;
    }

    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }
}
