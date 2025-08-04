import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt(); 
        System.out.println("Por favor, digite o número da agência:");
        sc.nextLine();
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do cliente:");
        sc.nextLine();
        String nomeCliente = sc.next();
        System.out.println("Por favor, digite o saldo da conta:");
        sc.nextLine();
        double saldo = sc.nextDouble();
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}