import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
// bloco apenas para entrada de dados do usuário.

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.nextLine();
        

        System.out.println("Digite o número da conta: ");
        int numeroConta = sc.nextInt();


        System.out.println("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

//resultado da entrada de dados
        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em nosso banco,sua agência é: " + agencia + " ,conta " + numeroConta + " ,e seu saldo: " + saldo + " ,já está disponível para saque!!");

        
        sc.close();
    }
}
