import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo a aplicação do nosso banco via terminal!");
        System.out.println();
        System.out.print("Por favor, digite o número da conta: ");
        int numConta = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia  = sc.next();
        sc.nextLine();
        System.out.print("Agora, por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
            agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
