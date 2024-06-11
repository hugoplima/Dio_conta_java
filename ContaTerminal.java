import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados
        System.out.println("Digite o número da Agência:");
        int agencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o número da Conta:");
        String numero = scanner.nextLine();

        System.out.println("Digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta:");
        double saldo = Double.parseDouble(scanner.nextLine());

        // Exibe a mensagem
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível.";
        System.out.println(mensagem);

        scanner.close();
    }
}