import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner PegarInformacaoCliente = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        int NumeroDaConta = PegarInformacaoCliente.nextInt();
        PegarInformacaoCliente.nextLine();

        System.out.println("Digite o número da agência: ");
        String NumeroDaAgencia = PegarInformacaoCliente.nextLine();

        System.out.println("Digite seu nome: ");
        String NomeDoCliente = PegarInformacaoCliente.nextLine();

        System.out.print("Digite seu saldo: ");
        double SaldoCliente = PegarInformacaoCliente.nextDouble();

        System.out.println("Olá " + NomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + NumeroDaAgencia + " conta " + NumeroDaConta + " e seu saldo " + SaldoCliente + " já disponível para saque.");

        PegarInformacaoCliente.close();
    }
}
